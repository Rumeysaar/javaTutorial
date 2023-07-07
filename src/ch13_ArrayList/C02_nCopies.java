package ch13_ArrayList;

import java.util.*;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>(List.of("ALMANYA", "POLONYA","UGANDA"));
        System.out.println("country = " + country);

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "erzurum", "izmir","konya"));
        System.out.println("city = " + city);

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7, "NEW ZEALAND"));
        System.out.println("yeniList = " + yeniList);

        //addAll methodu

        city.addAll(1,country);
        System.out.println("city = " + city);



    }
}
