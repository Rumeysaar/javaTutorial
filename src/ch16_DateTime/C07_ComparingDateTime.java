package ch16_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);
        LocalDate yarin = bugun.plusDays(1);
        LocalDate dogumGun = LocalDate.of(2000,2,29);

        System.out.println("dogumGun = " + dogumGun);
        System.out.println("bugun = " + bugun);
        System.out.println("dun = " + dun);
        System.out.println("yarin = " + yarin);

        System.out.println("bugun.isBefore(dun) = " + bugun.isBefore(dun));


    }
}
