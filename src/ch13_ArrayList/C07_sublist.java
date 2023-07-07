package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_sublist {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("ALMANYA", "POLONYA","UGANDA"));
        System.out.println("country = " + country);

        System.out.println("country.subList(1,4) = " + country.subList(1, 3));

        ArrayList<String> yeniList = new ArrayList<>(country.subList(2,3));
        System.out.println(yeniList);


    }
}
