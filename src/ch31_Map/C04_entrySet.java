package ch31_Map;

import java.util.HashMap;
import java.util.Map;

/*
entrySet() yöntemi, bir Map nesnesinin içindeki tüm girişleri (anahtar-değer çiftlerini) içeren
bir Set koleksiyonunu döndürür. Her giriş, Map.Entry arabirimi tarafından temsil edilir ve
bu arabirim, getKey() ve getValue() yöntemleri aracılığıyla anahtar ve değerlere erişim sağlar.
 */
public class C04_entrySet {
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

        System.out.println("hm.entrySet() = " + hm.entrySet());

        for (Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }








    }
}
