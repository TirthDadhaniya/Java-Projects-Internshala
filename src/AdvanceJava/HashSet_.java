package AdvanceJava;

import java.util.HashSet;

public class HashSet_ {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<>();

        //adding elements
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("Ford");

        //display
        System.out.println(cars);
        for (String car : cars){
            System.out.println(car);
        }

        //check if elements is in hashset or not
        System.out.println(cars.contains("BMW"));

        //remove element
        cars.remove("Audi");
        for (String car : cars){
            System.out.println(car);
        }

    }
}
