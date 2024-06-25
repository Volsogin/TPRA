package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(77777777));



    }

    public static int count7(int number){
        number = Math.abs(number);

        if (number == 0) {
            return 0;
        }

        int lastDigit = (int)(number % 10);
        int count = (lastDigit == 7) ? 1 : 0;



        return count + count7(number / 10);

    }


}
