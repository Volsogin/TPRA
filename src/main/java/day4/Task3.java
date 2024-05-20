package day4;
import java.util.Arrays;
import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int summa = 0;

        int[][] str = new int[12][8];
        int i = 0;
        int j = 0;
        j++;
        if(7 > j) {
                str[i][j] = (rand.nextInt(50) + 1);
                System.out.println(Arrays.toString(str));

        }
        else if (j == 7 ) {
            i++;
            j = j-7;


        }


    }

}
