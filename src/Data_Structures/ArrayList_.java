package Data_Structures;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {
    public static void main(String[] args) {

        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10,20,30,40,50));

        //Access and print elements from the ArrayList
        System.out.println("Element at index 0:"+numbers.get(0));
        System.out.println("Element at index 2:"+numbers.get(2));
        System.out.println("Element at index 4:"+numbers.get(4));

        // Adding new element
        numbers.addLast(60);
        System.out.println("Element at last is: " + numbers.get(5));

        // Calculate and print the sum of all elements in the ArrayList using FOR LOOP
        int sum_ = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum_ += numbers.get(i);
        }
        System.out.println("Sum is: " + sum_);

        // Calculate and print the sum of all elements in the ArrayList
        int sum=numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of ArrayList elements:"+sum);

        // Update an element in the ArrayList
        numbers.set(2,35);
        System.out.println("Updated element at index 2:"+numbers.get(2));

        // Iterate through the ArrayList using a for-each loop and print the elements
        System.out.println("Elements in the ArrayList:");
        for (int number:numbers)
        {
            System.out.println(number);
        }
    }
}
