package ch07_StringManipulations;

import java.util.Scanner;

public class C10_isEmpty {
    public static void main(String[] args) {

        String hi = "hello";

        System.out.println(hi.isEmpty());


        Scanner input = new Scanner(System.in);
        System.out.println("isim giriniz");
        String name = input.nextLine();

        if (name.isEmpty())
            System.out.println("isim kismi bos gecilemez");
        else if (name.isBlank()) {
            System.out.println("isim kismina harf giriniz");
        } else System.out.println("giris yapildi");




    }
}
