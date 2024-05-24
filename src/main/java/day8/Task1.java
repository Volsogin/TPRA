package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder numbersSB = new StringBuilder();
        for(int i = 0; i<20001;) {
            numbersSB.append(" " + i);
            i++;
        }
        System.out.println(numbersSB);
        long stopTime = System.currentTimeMillis();
        long Time = stopTime - startTime;

        long startTimeST = System.currentTimeMillis();
        String numberST = "";
        for(int i = 0; i<20001;) {
            numberST = " " + i;
            i++;
            System.out.print(" " +numberST);
        }

        long stopTimeST = System.currentTimeMillis();
        long TimeST = stopTimeST - startTimeST;
        System.out.println("\nДлительность работы StringBuilder, в мс.: " + Time);
        System.out.println("Длительность работы String, в мс.: " + TimeST);



    }
}
