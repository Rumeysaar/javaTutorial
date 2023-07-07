package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("ALMANYA", "POLONYA","UGANDA"));
        System.out.println("country = " + country);

        System.out.println(country.isEmpty());
        country.clear();
        System.out.println(country);
        System.out.println(country.isEmpty());

    }
}
