package AdvanceJava;

public class ExceptionThrow {

    public static void main(String[] args) {

        try {
            int age = -5;
            validate(age);
            System.out.println("Age is positive");
        }
        catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

    }

    public static void validate(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive");
        }
    }
}
