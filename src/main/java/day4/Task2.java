package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class Task2 {
    public static void main(String[] args) {

        Random rand = new Random();






            int kono = 0;
        int konoplus = 0;



        int n = 2;
        int[] mass = new int[n];
        int max = mass[0];
        int min = mass[0];
        for (int x:mass){
            x = rand.nextInt((10000) + 1);
                if (x > max) {
                    max = x;
        }
                if (x<min) {
                    min=x;
                }

        }
        System.out.println(min);
        System.out.println(max);








    }
}
