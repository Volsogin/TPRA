package day18;

public class Task1 {
    static int n = 0;


    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};


        System.out.println(recursionSum(numbers,0));
    }


    public static int recursionSum(int[] array, int index) {

        if (index == array.length) {
            return 0;
        }


        return array[index] + recursionSum(array, index + 1);



    }
}
