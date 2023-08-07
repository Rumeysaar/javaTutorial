package ch31_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
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

        System.out.println("hm.containsKey(\"Apple\") = " + hm.containsKey("Apple"));
        System.out.println("hm.containsKey(\"apple\") = " + hm.containsKey("apple"));
        System.out.println("hm.containsValue(\"250 $\") = " + hm.containsValue("250 $"));
        System.out.println("hm.containsValue(\"200$\") = " + hm.containsValue("200$"));

    }
}
