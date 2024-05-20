package day4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] x = new int[n];
        int num = 8;
        int mun = 0;
        int one = 0;
        int ch = 0;
        int nech = 0;
        int summa = 0;



        for(int i = 0; i<x.length; i++) {

            x[i] = rand.nextInt((10) + 1);

                if(x[i] > num) {
                    mun++;
                }
                if(x[i] == 1) {
                    one++;
                }
                if(x[i]%2 == 0) {
                    ch++;
                }
                if(x[i]%2 != 0) {
                    nech++;
                }
                summa = summa+x[i];


        }

        System.out.println(Arrays.toString(x));

        System.out.println("\nДлина Массива: " + n);
        System.out.println("Количество чисел больше 8: " + mun);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + ch);
        System.out.println("Количество нечетных чисел: " + nech);
        System.out.println("Сумма всех элементов массива: " + summa);














    }
}
