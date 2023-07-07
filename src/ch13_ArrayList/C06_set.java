package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("ALMANYA", "POLONYA","UGANDA"));
        System.out.println("country = " + country);

        System.out.println("country.size() = " + country.size());

        System.out.println("country.set(0, \"AMERIKA\") = " + country.set(0, "AMERIKA"));

        System.out.println("country.size() = " + country.size());

    }
}
