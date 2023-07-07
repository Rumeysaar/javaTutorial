package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_get {
    public static void main(String[] args) {

        ArrayList<String> country = new ArrayList<>(List.of("ALMANYA", "POLONYA","UGANDA"));
        System.out.println("country = " + country);

        System.out.println("country.get(1) = " + country.get(1));

        //System.out.println("country.get(20) = " + country.get(20)); out of bounds


    }
}
