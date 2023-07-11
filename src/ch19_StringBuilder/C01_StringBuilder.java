package ch19_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {
        String str = "javAslan";
        System.out.println(str);
        strBirlestir(str);
        System.out.println("metod sonrasi =" + str);

        // task -> 50000 tekrarlı bir loop ile String ve StringBuilder obj run time
       // surelerini karsılatırın

        String s = "a";
        StringBuilder sb1 = new StringBuilder("");

        LocalTime str1Basla = LocalTime.now();
        System.out.println("str1Basla = " + str1Basla);

        for (int i = 0; i < 50000; i++) {
            s += i;
        }
        LocalTime str1Bitir = LocalTime.now();
        System.out.println("str1Bitir = " + str1Bitir);

        System.out.println("fark =" + (str1Bitir.getNano()- str1Basla.getNano()));


        LocalTime sb1Basla = LocalTime.now();
        System.out.println("sb1Basla = " + sb1Basla);

        for (int i = 0; i < 50000; i++) {
            sb1.append(i);
        }
        LocalTime sb1Bitir = LocalTime.now();
        System.out.println("sb1Bitir = " + sb1Bitir);

        System.out.println("fark =" + (sb1Bitir.getNano()- sb1Basla.getNano()));



    }

    private static void strBirlestir(String str) {
        System.out.println(str + "selam metoddan");
    }
}
