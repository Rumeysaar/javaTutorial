package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "erzurum", "izmir","konya"));
        System.out.println("city = " + city);

        ArrayList <String> country = new ArrayList<>(List.of("ALMANYA", "POLONYA","UGANDA"));
        System.out.println("country = " + country);

        System.out.println("city.indexOf(\"Ankara\") = " + city.indexOf("Ankara"));

        System.out.println("city.indexOf(\"samsun\") = " + city.indexOf("samsun"));

        country.add("Ingiltere");
        System.out.println("country.indexOf(\"Ingiltere\") = " + country.indexOf("Ingiltere"));
        System.out.println("country.lastIndexOf(\"Ingiltere\") = " + country.lastIndexOf("Ingiltere"));

        country.add("ALMANYA");
        System.out.println("country.indexOf(\"ALMANYA\") = " + country.indexOf("ALMANYA"));


    }

}
