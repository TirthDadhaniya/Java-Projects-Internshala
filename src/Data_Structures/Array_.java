package Data_Structures;

public class Array_ {

        public static void main(String[] args)
        {
            int[] numbers={10,20,30,40,50}; // Initialize an array of integers

            System.out.println("Element at index 0:"+numbers[0]);
            System.out.println("Element at index 2:"+numbers[2]);
            System.out.println("Element at index 4:"+numbers[4]);

            int sum =0;
            for (int i = 0; i < numbers.length; i++)
            {
                sum+=numbers[i];
            }
            System.out.println("Sum of array elements:"+sum);

            numbers[2]=35; // Update an element in the array

            System.out.println("Updated element at index 2:"+numbers[2]);

            System.out.println("Elements in the array:");
            for (int elements : numbers)
            {
                System.out.println(elements);
            }
        }
    }