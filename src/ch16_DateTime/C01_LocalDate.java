package ch16_DateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);

        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());

        System.out.println("bugun.getEra() = " + bugun.getEra());
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());

        LocalDate date1 = LocalDate.of(1995, 8, 12);
        System.out.println("date1 = " + date1);

    }
}
