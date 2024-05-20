package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int a = scan1.nextInt();
        int b = scan2.nextInt();
        int in = 0;


        while (a < b) {
            a++;
            if(a %5 == 0 && a % 10 > 0) {
                System.out.println(a);
            }

        }

    }
}
