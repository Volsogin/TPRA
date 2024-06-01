package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Task2 {
    public static void main(String[] args) {
        try {
            // Создаем и заполняем file1.txt случайными целыми числами
            File file1 = new File("file1.txt");
            fillFileWithRandomIntegers(file1, 1000, 0, 100);

            // Создаем file2.txt на основании данных из file1.txt
            File file2 = new File("file2.txt");
            createFileWithAverages(file1, file2, 20);

            // Выводим результат
            printResult(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void fillFileWithRandomIntegers(File file, int count, int min, int max) throws IOException {
        try (FileWriter writer = new FileWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                int number = random.nextInt(max - min + 1) + min;
                writer.write(number + " ");
            }
        }
    }
    public static void createFileWithAverages(File inputFile, File outputFile, int groupSize) throws IOException {
        List<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        }

        try (FileWriter writer = new FileWriter(outputFile)) {
            for (int i = 0; i < numbers.size(); i += groupSize) {
                double sum = 0;
                for (int j = i; j < i + groupSize && j < numbers.size(); j++) {
                    sum += numbers.get(j);
                }
                double average = sum / groupSize;
                writer.write(average + " ");
            }
        }
    }

    public static void printResult(File file) {
        List<Double> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextDouble()) {
                numbers.add(scanner.nextDouble());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + file.getPath());
            return;
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        System.out.println("Ответ: " + (int) sum);
    }



}
