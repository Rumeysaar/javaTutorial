package ch30_Collections.C02_Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Co2_Set {
    public static void main(String[] args) {

       Set<String> set =new HashSet<>();

       set.add("Amsterdam");
       set.add("Berlin");
       set.add("Istanbul");
       set.add("Oslo");
       set.add("Madrid");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.println("element = " + element);
        }









    }
}
