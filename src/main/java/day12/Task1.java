package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Huanan");
        cars.add("Mercedes");
        cars.add("Tesla Model X"); // 1
        cars.add("Apple Truck");
        cars.add("BMW");
        System.out.println(cars);
        cars.remove(0);
        cars.set(1, "Tesla CyberTruck");
        cars.set(2,"Tesla Model X");
        cars.set(3,"Apple Truck");
        cars.add(4,"BMW");






        System.out.println(cars);













    }
}
