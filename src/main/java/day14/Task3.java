package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people.txt");
        try {
            List<Person> people = parseFileToObjList(file);

                System.out.println(people);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException, IllegalArgumentException {
        if (!file.exists()) {
            throw new FileNotFoundException();
        }

        List<Person> people = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                if (parts.length != 2) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                String name = parts[0];
                int age;
                try {
                    age = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                if (age < 0) {
                    throw new IllegalArgumentException("Некорректный входной файл");
                }

                people.add(new Person(name, age));
            }
        }

        return people;
    }
}
