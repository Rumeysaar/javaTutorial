package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("MADAGASKAR",  "ALMANYA", "POLONYA","UGANDA", "ITALYA"));
        System.out.println(country);

        System.out.println(country.contains("ALMANYA"));
        System.out.println(country.contains("uganda"));


    }
}
