package ch30_Collections.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {
    public static void main(String[] args) {

        HashSet<String> hs1 = new HashSet<>(Arrays.asList("Germany", "England", "South Africa", "Brazil", "USA"));

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Germany", "China", "Brazil", "France", "USA"));

        commonValues(hs1, hs2);


    }

    private static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2) {
       hs1.retainAll(hs2);
        ArrayList<String> arr = new ArrayList<>(hs1);

       //for (String w : hs1) {
       //    if (hs2.contains(w)) {
       //        arr.add(w);
       //    }
       //}
        System.out.println("arr = " + arr);
        return arr;
    }


}
