package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        File file = new File("People.txt");
        List<String> people = parseFileToStringList(file);
        if(people != null){
            for(String person : people) {
                System.out.println(person);
            }
        }



    }

    public static List<String> parseFileToStringList(File file) {
        if(!file.exists()){
            System.out.println("Файл не найден");
            return null;
        }

        List<String> people = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                if(parts.length != 2){
                    System.out.println("Некорректный входной файл");
                    return null;
                }

                String name = parts[0];
                int age;
                try {
                    age = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный входной файл");
                    return null;
                }
                if(age < 0) {
                    System.out.println("Некорректный входной файл");
                    return null;
                }

                people.add(name + " " + age);
            }


        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
            return null;
        }


        return people;

    }
}


