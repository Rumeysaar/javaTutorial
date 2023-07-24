package ch26_Exception;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {

      // RTE  LocalDate date = LocalDate.of(2023,4,33);
        //System.out.println("date " + date);


        try {
            LocalDate date = LocalDate.of(2023,4,33);
            System.out.println("try sorunsuz calisti");
        } catch (DateTimeException e) {
            System.out.println("catch block exception yakaladi ayin gunu fazla");
            System.out.println(e.getMessage());
        }

        System.out.println("sorun cozuldu devam");

    }
}
