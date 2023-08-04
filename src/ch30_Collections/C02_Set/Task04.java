package ch30_Collections.C02_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Task04 {
    public static void main(String[] args) {

       long startHs = System.nanoTime();

        HashSet<Integer> hashSet = new HashSet<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(1000);//0-999 arasi deger
            hashSet.add(randomNumber);
        }

        long endHs = System.nanoTime();
        System.out.println("endHs - startHs = " + (endHs - startHs));

        long startTs = System.nanoTime();

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(1000);//0-999 arasi deger
            treeSet.add(randomNumber);
        }

        long endTs = System.nanoTime();
        System.out.println("endTs - startTs = " + (endTs - startTs));

        TreeSet<Integer> treeSet1 =new TreeSet<>(hashSet);
        System.out.println(treeSet1);


    }
}
