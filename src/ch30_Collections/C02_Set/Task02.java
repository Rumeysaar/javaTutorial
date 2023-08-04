package ch30_Collections.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {

        Long tsBasla = System.currentTimeMillis();

        TreeSet<String> ts = new TreeSet<>();
        ts.add("aragorn");
        ts.add("sam");
        ts.add("jack");
        ts.add("legolas");
        ts.add("gandalf");

        System.out.println("ts = " + ts);

        Long tsBitis = System.currentTimeMillis();

        System.out.println("treeset run suresi = " + (tsBitis - tsBasla));


        Long hsBasla = System.currentTimeMillis();

        HashSet<String> hs = new HashSet<>();
        hs.add("aragorn");
        hs.add("sam");
        hs.add("jack");
        hs.add("legolas");
        hs.add("gandalf");

        System.out.println("hs = " + hs);

        Long hsBitis = System.currentTimeMillis();

        System.out.println("hashset run suresi = " + (hsBitis - hsBasla));




    }
}
