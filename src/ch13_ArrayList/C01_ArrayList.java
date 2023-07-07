package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {

        int sayi = 99;
        int [] arr = new int[5];
        int [][] arrMd = new int [5][6];

        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.println("names = " + names);
        System.out.println("numbers = " + numbers);

        names.add("22");
        names.add("safak");
        names.add("iclal");
        names.add("rukiye");
        names.add("ali");
        names.add("burjuva");
        names.add("proleterya");

        System.out.println("names = " + names);

        numbers.add(55);
        numbers.add(65);
        numbers.add(34);
        numbers.add(35);
        numbers.add(33);
        numbers.add(9);
        numbers.add(96);
        numbers.add(55);
        System.out.println("numbers = " + numbers);

        //arraylist eleman ekleme 2.yol
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "erzurum", "izmir","konya"));
        System.out.println("city = " + city);

        //arraylist eleman ekleme 3.yol
        ArrayList <String> country = new ArrayList<>(List.of("ALMANYA", "POLONYA","UGANDA"));
        System.out.println("country = " + country);

        country.add(1, "TURKIYE");
        System.out.println("country = " + country);
        System.out.println("country.size() = " + country.size());


    }
}
