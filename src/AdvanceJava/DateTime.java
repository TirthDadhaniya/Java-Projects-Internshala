package AdvanceJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time before formating is " + currentDateTime);

        DateTimeFormatter newDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(newDateTime);
        System.out.println("New formated date and time is " + formattedDateTime);
    }
}
