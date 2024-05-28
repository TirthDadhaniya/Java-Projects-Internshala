package AdvanceJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time is " + currentDateTime);
    }
}
