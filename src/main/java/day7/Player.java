package day7;

import java.util.Random;

public class Player {

    private int stamina;
    private static int MAX_STAMINA = 100;
    private static int MIN_STAMINA = 0;
    private static int countplayers = 0;
    private int Pstamina;
    int itog;



    public int getCountplayers(){
        return countplayers;
    }
    void run(){
        Pstamina--;
        if(Pstamina == 0)
            countplayers--;
    }



    public void main(){
        Random rand = new Random();
        int number = MAX_STAMINA - 95 + 1;
        int i = rand.nextInt() % number;
        Pstamina = 95 + i;
        if(countplayers<7)
            countplayers++;
        else if (countplayers >=7)
            countplayers--;

        if(Pstamina <= 0)
            countplayers--;
    }





    public Player(){

    }



    static void info(){
        if(countplayers == 6)
            System.out.println("На поле нет свободных мест");
        else if (countplayers == 5)
            System.out.println("На поле 1 свободное место");
        else if (countplayers == 4)
            System.out.println("На поле 2 свободных места");
        else if (countplayers == 3)
            System.out.println("На поле 3 свободных мест");
        else if (countplayers == 2)
            System.out.println("На поле 4 свободных мест");
        else if (countplayers == 1)
            System.out.println("На поле 5 свободных мест");
        else if (countplayers == 0) {
            System.out.println("На поле 6 свободных мест");
        }
        else if (countplayers > 6)
            System.out.println("На поле нет свободных мест");
    }

    public int getStamina(){
        return stamina;

    }

    public int getPstamina(){
        return Pstamina;
    }

}



