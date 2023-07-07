package ch16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println("dt = " + dt); //2023-07-06T19:56:15.438052

        System.out.println("dt.plusYears(3) = " + dt.plusYears(3));


    }
}
