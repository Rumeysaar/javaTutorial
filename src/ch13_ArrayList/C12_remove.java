package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR",  "ALMANYA", "POLONYA","UGANDA", "ITALYA"));
        System.out.println(country);

        Collections.sort(country);
        System.out.println("country.remove(\"Norway\") = " + country.remove("Norway"));

        System.out.println("country.remove(\"UGANDA\") = " + country.remove("UGANDA"));

        System.out.println("country.remove(0) = " + country.remove(0));

        country.add("AMERICA");
        country.add("HOLLANDA");
        country.add("UKRAYNA");
        country.add("AMERICA");
        System.out.println("country = " + country);

        System.out.println(country.remove("AMERICA"));
        System.out.println("country = " + country);

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "erzurum", "izmir","konya"));
        System.out.println("city = " + city);

        country.addAll(city);
        System.out.println("country = " + country);

        country.removeAll(city);
        System.out.println("country = " + country);





    }
}
