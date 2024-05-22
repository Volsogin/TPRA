package day7;

public class Task2 {
    public static void main(String[] args){



        Player First = new Player();
        First.main();
        Player Second = new Player();
        Second.main();
        Player Third = new Player();
        Third.main();
        Player Fourth = new Player();
        Fourth.main();
        Player Fifth = new Player();
        Fifth.main();
        Player Sixth = new Player();
        Sixth.main();

        Player.info();
        for(int i = 0; i<100; i++)
            First.run();

        Player.info();



    }
}
