package ch31_Map;

import java.util.HashMap;
import java.util.Map;

/*
keySet() yöntemi, harita içindeki tüm anahtarları içeren bir Set koleksiyonunu döndürür.
Harita içindeki anahtarlar benzersizdir ve bu yöntem sayesinde onlara koleksiyon benzeri bir şekilde erişebiliriz.

values() yöntemi de Map arabirimine aittir. Bu yöntem, harita içindeki tüm değerleri içeren bir Collection
 (genellikle ArrayList) koleksiyonunu döndürür. Harita içindeki değerler yinelenen olabilir
 ve bu yöntem sayesinde onlara koleksiyon benzeri bir şekilde erişebiliriz.
 */
public class C02_KeySet_values {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        // hm.put(); mape key ve valu ekleme yapar
        hm.put("Apple",  "250 $");
        hm.put("Samsung", "20 $");
        hm.put("Huawei", "150 $");
        hm.put(null,     "200 $");
        hm.put(null,        null);
        hm.put("Hp",     "200 $");
        hm.put("Casper","1000 $");
        hm.put("Casper", "101 $");

        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (String w:hm.keySet()) {
            System.out.print("w = " + w + " ");
        }
        System.out.println();
        for (String q: hm.values()) {
            System.out.print("q = " + q + " ");
        }

        // tommy lee jonestan
        for (String w: hm.keySet()){
            System.out.println(w+" == " + hm.get(w));
        }

        // LinkedHashMap içindeki key-value çiftlerini sırayla çıktı olarak al
       //for (Map.Entry<String, String> entry : hm.entrySet()) {
       //    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
       //}  //chat gpt
    }
}
