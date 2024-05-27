package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = gNR(0,30);

            for(int i = 0; i<=30; i++){
                if (i % 2 == 0){
                    System.out.println(numbers.get(i));
                }

            }



    }
    public static List<Integer> gNR(int start, int end) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        return list;
    }
}
