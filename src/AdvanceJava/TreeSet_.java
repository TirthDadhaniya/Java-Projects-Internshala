package AdvanceJava;

import java.util.TreeSet;

public class TreeSet_ {

    public static void main(String[] args) {

        TreeSet<String> cars = new TreeSet<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        //display
        System.out.println(cars);

        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println(cars.contains("BMW"));


        //remove
        cars.remove("BMW");
        System.out.println(cars);

        System.out.println(cars.contains("BMW"));
    }
}
