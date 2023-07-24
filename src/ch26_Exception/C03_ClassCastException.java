package ch26_Exception;

import java.util.Objects;

public class C03_ClassCastException {
    public static void main(String[] args) {
// ClassCastException -> Biribirne dönüştürülemeyen data type'lar biribirine dönüştürüldüğünde oluşan
// RTE Exception dur

        Object obj = "javadan sudan konusuyoruz";
        String str = (String) obj;
        System.out.println("str = " + str);

        Object sayi = 10;
       // String str2 = (String) sayi; Exception in thread "main" java.lang.ClassCastException

        try {
            String str2 = (String) sayi;
        } catch (ClassCastException e) {
            System.out.println("integer bir deger string e cast edilemez");
        }

        try {
            String str3 = (String) obj;
            System.out.println("bu kodu okuduysan kod hatasiz calismis demektir");
        } catch (Exception e) {
            System.out.println("cast islemi basarisiz");

        }

        System.out.println("bu kod calisir mi");

    }
}
