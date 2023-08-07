package ch31_Map;

import java.util.HashMap;

/*
get() yöntemi, bir harita içinde belirtilen anahtarın karşılık gelen değerini elde etmek için kullanılır.
 Eğer verilen anahtar haritada bulunmazsa, null değeri döndürür.

 */
public class C03_get {
    public static void main(String[] args) {


        HashMap<String, String> hm = new HashMap<>();

        hm.put("Apple",  "250 $");
        hm.put("Samsung", "20 $");
        hm.put("Huawei", "150 $");
        hm.put(null,     "200 $");
        hm.put(null,        null);
        hm.put("Hp",     "200 $");
        hm.put("Casper","1000 $");
        hm.put("Casper", "101 $");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(\"Apple\") = " + hm.get("Apple"));//hm.get("Apple") = 250 $
        System.out.println("hm.get(\"Xiaomi\") = " + hm.get("Xiaomi")); // null

        System.out.println("hm.get(12) = " + hm.get(12)); // null
        //'HashMap<String, String>' may not contain keys of type 'Integer'
    }
}
