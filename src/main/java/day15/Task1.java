package day15;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        File inputFile = new File("src/main/resources/shoes.csv");
        File missingShoesFile = new File("src/main/resources/missing_shoes.txt");
        try {
            missingShoesFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибка");
        }


        try (Scanner scanner = new Scanner(inputFile); PrintWriter pw = new PrintWriter(missingShoesFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");

                if (parts.length != 3) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                String name = parts[0];
                int size;
                int count;
                try {
                    size = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                try {
                    count = Integer.parseInt(parts[2]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                if (size < 0) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                if (count == 0) {
                    pw.println(name + ", " + size + ", " + count);
                }
                if (count < 0) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }


            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println();


    }
}
