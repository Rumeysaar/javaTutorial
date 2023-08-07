package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C10_remove {
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

        System.out.println("map.remove(\"Samsung\") = " + map.remove("Samsung"));
        System.out.println("map.remove(\"Samsung\", \"20 $\") = " + map.remove("Samsung", "20 $"));
        System.out.println("map.remove(null) = " + map.remove("null"));
        System.out.println("map = " + map);
        System.out.println("map.remove(\"Istanbul\") = " + map.remove("Istanbul"));


    }
}
