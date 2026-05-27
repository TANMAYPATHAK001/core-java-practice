package basics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class date_time {
    public static void main(String[] args) {

        // How to work with DATES & TIMES using java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        Instant instant = Instant.now();
//
//
//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(dateTime);
//        System.out.println(instant);

        // Custom format

//        LocalDateTime dateTime1 = LocalDateTime.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//
//        String newDateTime = dateTime1.format(formatter);
//        System.out.println(newDateTime);


        // Custom Date Object
        LocalDateTime date1 = LocalDateTime.of(2026, 12, 30, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2027, 10, 25, 0, 0, 0);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }
        else{
            System.out.println("Enter a valid date!");
        }


    }

}
