package ch31_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class C12_HashTable {
    public static void main(String[] args) {

        Hashtable<String , String> ht = new Hashtable<>();

        ht.put("Zeynep", "123456789");
        ht.put("fatih","82875252885");
        ht.put("kemal",  "282828282");
        ht.put("ali",     "85283863");
        ht.put("iclal","28282852852");
        ht.put("safak",  "828282852");

        System.out.println("ht = " + ht);

        ht.put("null",  "828282852");
        //ht.put(null,  "828282852");

        System.out.println("ht = " + ht);

        Hashtable<String, String> ht2 = new Hashtable<>(ht);

        ht2.put("elma",   "50 $");
        ht2.put("armut",  "20 $");
        ht2.put("karpuz", "15 $");
        ht2.put("kavun",  "20 $");
        ht2.put("uzum",   "20 $");
        ht2.put("muz",    "10 $");

        System.out.println("map = " + ht2);

        ht.putAll(ht2);
        System.out.println("hm = " + ht);

        System.out.println("map = " + ht2);


    }
}
