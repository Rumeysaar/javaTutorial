package ch31_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1000, "Ahmet");
        tm.put(1001, "Emine");
        tm.put(1002, "Eren");
        tm.put(1003, "Derya");

        System.out.println("tm = " + tm);

        Map<String, String> map = new HashMap<>();

        map.put("Apple",  "250 $");
        map.put("Samsung", "20 $");
        map.put("Huawei", "150 $");
        map.put("Hp",     "200 $");
        map.put("Casper","1000 $");
        map.put("Casper", "101 $");

        System.out.println("map = " + map);

        TreeMap<String, String> tm1 = new TreeMap<>(map);
        System.out.println("tm1 = " + tm1);

        // CTE TreeMap <String, String> tm2 = map;

        System.out.println("tm.ceilingKey(1000) = " + tm.ceilingKey(999)); // =1000
        System.out.println("tm.ceilingKey(2000) = " + tm.ceilingKey(2000));// null
        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());
        System.out.println("tm.keySet() = " + tm.keySet());

    }
}
