package ch07_StringManipulations;

import java.util.Scanner;

public class C05_startWith_endWith {
    public static void main(String[] args) {

        String city = "Istanbul";
        System.out.println("city.startsWith(\"i\") = " + city.startsWith("i"));

        System.out.println("city.startsWith(\"Ist\") = " + city.startsWith("Ist"));

        System.out.println("city.startsWith(\"stanb\") = " + city.startsWith("stanb"));

        System.out.println("city.startsWith(\"t,2\") = " + city.startsWith("t", 2));

        System.out.println("city.endsWith(\"bul\") = " + city.endsWith("bul"));

        String str = "nbul";
        System.out.println("city.endsWith(str) = " + city.endsWith(str));

        Scanner input = new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String mail = input.nextLine();

        System.out.println(mail.endsWith("@gmail.com") ? "hesabiniz onaylandi" : "gecerli hesap giriniz");


    }
}
