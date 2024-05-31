package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Numbers.txt");
        printSumDigits(file);


    }

    public static void printSumDigits(File file){
        try {
            Scanner scan = new Scanner(file);
            String line = scan.nextLine();
            String[] numString = line.split(" ");
            int[] nums = new int[10];
            int count = 0;
            int all = 0;

            for(String num : numString) {

                try {
                    all += Integer.parseInt(num);
                    nums[count++] = Integer.parseInt(num);
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Некорректный входной файл");
                    break;
                }


            }

            if(count != 10){
                scan.close();
            }
            else if(count == 10) {
                System.out.println(all);
            }


            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
