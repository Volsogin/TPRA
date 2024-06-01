package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Numbers.txt");
        printResult(file);

    }
    public static void printResult(File file) {
        List<Double> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    numbers.add(scanner.nextDouble());
                } else {
                    System.err.println("Некорректное значение: " + scanner.next());
                    scanner.next();
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + file.getPath());
            return;
        }


        if (!numbers.isEmpty()) {
            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }
            double average = sum / numbers.size();

            String formattedAverage = String.format("%.3f", average);
            System.out.printf("Ответ: %s --> %s%n", average, formattedAverage);
        } else {
            System.out.println("Файл не содержит корректных чисел.");
        }
    }

}

