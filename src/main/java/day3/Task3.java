package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {




        for (int i = 0; i <= 4; i++ ) {

            Scanner scanner = new Scanner(System.in);
            float x = scanner.nextFloat();
            float y = scanner.nextFloat();
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            else if (y > 0) {
                System.out.println(x / y);
                continue;
            }







        }



    }
}
