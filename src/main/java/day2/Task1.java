package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Сколько этажей в доме?\n");

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x < 5 & x > 0 )
            System.out.println("Это Малоэтажный дом");
        else if (x > 4 & x < 9)
            System.out.println("Это Среднеэтажный дом");
        else if (x > 8)
            System.out.println("Это Многоэтажный дом");
        else if(x < 1)
            System.out.println("Ошибка ввода");


    }
}
