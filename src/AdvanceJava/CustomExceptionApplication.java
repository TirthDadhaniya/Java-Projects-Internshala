package AdvanceJava;

import java.util.Scanner;

public class CustomExceptionApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please enter your age");
            int age = sc.nextInt();
            validateage(age);
            System.out.println("You can access the website");
        }
        catch (CustomException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


    public static void validateage(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is below 18. You can't access website");
        }
    }
}
