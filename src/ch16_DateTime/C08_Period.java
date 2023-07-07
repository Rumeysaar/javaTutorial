package ch16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();

        LocalDate birthday = LocalDate.of(1995,8,12);

        Period fark = Period.between(birthday, bugun);
        System.out.println("fark = " + fark);

        System.out.println("bugun.compareTo(birthday) = " + bugun.compareTo(birthday));

        LocalDate gun = LocalDate.of(2023, 5, 2);
        Period period = Period.ofMonths(9);
        System.out.println("gun.plus(period) = " + gun.plus(period));

    }
}
