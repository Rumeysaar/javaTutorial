package ch16_DateTime;

import java.time.*;

public class OrnekKullaniciBilgileri {
    public static void main(String[] args) {

        String name ;
        int yas ;
        LocalDate dogumtarihi ;
        LocalTime uygulamayaBaslamaZamani ;


        System.out.println(LocalDate.of(2014, 6, 21));
        System.out.println(LocalDate.of(2014, Month.JUNE, 21));

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        //date.plusDays(2);
        //System.out.println("date = " + date);


    }
}
