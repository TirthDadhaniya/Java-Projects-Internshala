package AdvanceJava;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator");
        int num1 = sc.nextInt();
        System.out.println("Enter the denominator");
        int num2 = sc.nextInt();

        try {
            int result = num1/num2;
            System.out.println("The result is " + result);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Finally block");
        }


    }
}
