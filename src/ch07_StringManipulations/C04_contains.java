package ch07_StringManipulations;

import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {

        String str = "java ile gunler";
        System.out.println("str = " + str);

        System.out.println("str.contains(\"java\") = " + str.contains("java"));

        System.out.println("str.contains(\" \") = " + str.contains(""));

        String dolap = "elma, armut, sut, yumurta";

        //Scanner input = new Scanner(System.in);
        //System.out.println("urun giriniz");
        //String urun = input.nextLine();
//
        //String result = dolap.contains(urun) ? "urun var" : "urun yok" ;
        //System.out.println("result = " + result);

        String password = "12345";

        Scanner input = new Scanner(System.in);
        System.out.println("sifre giriniz");
        String sifre = input.nextLine();

       String result = sifre.equals(password) ? "correct" : "access denied";
        System.out.println("result = " + result);












    }
}
