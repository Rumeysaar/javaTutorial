package ch30_Collections.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class C01_HashSet {
    public static void main(String[] args) {

        HashSet<String> hs =new HashSet<>(); // bos hashset
        HashSet<String> hs1 =new HashSet<>(Arrays.asList("meryem","ali","sefa","iclal","emine","eren"));

        System.out.println("hs1 = " + hs1);

        hs1.add("Meryem");
        System.out.println("hs1 = " + hs1);

        hs1.add("tommy");
        System.out.println("hs1 = " + hs1);

        hs1.add("ali");
        System.out.println("hs1 = " + hs1);

        hs1.add("sefa");
        System.out.println("hs1 = " + hs1);

        hs1.add(null);
        hs1.add(null);
        hs1.add(null);

        System.out.println("hs1 = " + hs1);

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("method","interface de", "tanimlanir"));
        System.out.println("hs2 = " + hs2);

        System.out.println("hs1.addAll(hs2) = " + hs1.addAll(hs2));
        System.out.println("hs1 = " + hs1);

        System.out.println("hs1.remove(\"method\") = " + hs1.remove("method"));
        System.out.println("hs1 = " + hs1);

        System.out.println("hs1.removeAll(hs2) = " + hs1.removeAll(hs2));
        System.out.println("hs1 = " + hs1);

        System.out.println("hs2 = " + hs2);

        System.out.println("hs1.size() = " + hs1.size());

        hs1.clear();

        System.out.println("hs1.isEmpty() = " + hs1.isEmpty());

        System.out.println("hs1.size() = " + hs1.size());
        System.out.println("hs1 = " + hs1);

        System.out.println("hs2.contains(\"method\") = " + hs2.contains("method"));

        System.out.println("hs2.hashCode() = " + hs2.hashCode());

    }
}
