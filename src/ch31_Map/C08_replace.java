package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C08_replace {
    public static void main(String[] args) {

       Map<String, String> map = new HashMap<>();

        map.put("Apple",  "250 $");
        map.put("Samsung", "20 $");
        map.put("Huawei", "150 $");
        map.put(null,     "200 $");
        map.put("null",      null);
        map.put("Hp",     "200 $");
        map.put("Casper","1000 $");
        map.put("Casper", "101 $");

        System.out.println("map = " + map);

        System.out.println("map.replace(\"Apple\",\"500\") = " + map.replace("Apple", "500"));

        System.out.println("map = " + map);

        //System.out.println("map.replace(\"apple\", \"550\") = " + map.replace("apple", "550"));

        System.out.println("map.replace(\"Apple\", \"500\") = " + map.replace("Apple", "500"));

        System.out.println("map.replace(\"Samsung\", \"50\") = " + map.replace("Samsung", "50"));





    }
}
