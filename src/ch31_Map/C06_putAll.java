package ch31_Map;

import java.util.HashMap;
import java.util.Map;

public class C06_putAll {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("Apple",  "250 $");
        hm.put("Samsung", "20 $");
        hm.put("Huawei", "150 $");
        hm.put(null,     "200 $");
        hm.put("null",      null);
        hm.put("Hp",     "200 $");
        hm.put("Casper","1000 $");
        hm.put("Casper", "101 $");

        System.out.println("hm = " + hm);

        Map<String, String> map = new HashMap<>();

        map.put("elma",   "50 $");
        map.put("armut",  "20 $");
        map.put("karpuz", "15 $");
        map.put("kavun",  "20 $");
        map.put("null",     null);
        map.put("uzum",   "20 $");
        map.put("muz",    "10 $");

        System.out.println("map = " + map);

        hm.putAll(map);
        System.out.println("hm = " + hm);

        //clean code

        HashMap<String, String> hm2 = new HashMap<>(map);
        //hm2 create edildi entry olarak map parametre olarak atandi
        HashMap<String, String> hm3 = hm;
        //putAll methoduyla birlestigi icin hm maple birlikte geldi
        System.out.println("hm2 = " + hm2);
        System.out.println("hm3 = " + hm3);

    }
}
