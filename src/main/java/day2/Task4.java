package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Приветствую. Давайте попробуем найти y.\nВведите число x по формуле y =(x^2 - 10) / (x + 7).\nТакже x должен быть больше 5");
        Scanner scan1 = new Scanner(System.in);
        double x = scan1.nextDouble();
        double y = (x*x - 10) / (x + 7);


        if(x > 5)
            System.out.println("y будет равняться " + y);
        else {
            System.out.println("x должен быть больше 5. Неверно.");
            System.exit(0);
        }

        System.out.println("Теперь попробуем ещё одну формулу. y = (x + 3)(x^2 - 2).\nТакже следуй этому равенству: -3 < x < 5");
        Scanner scan2 = new Scanner(System.in);
        double x2 = scan2.nextDouble();
        double y2 = (x + 3)*(x*x-2);
        if (-3 < x2 && x2 < 5)
            System.out.println("y будет равняться " + y2);
        else {
            System.out.println("Ты не соблюдаешь условия.");
            System.exit(0);
        }










    }
}
