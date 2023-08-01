package ch30_Collections.C01_LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("dortmund", "javaCAN", "javaTAR", "berlin"));
        System.out.println(linkedList1);


        Scanner input = new Scanner(System.in);
        System.out.println("bir deger giriniz");
        String istenen = input.next();

        // for (String each:linkedList1) {
        //     if (each.equals(istenen)){
        //         linkedList1.remove(each);
        //         System.out.println("linkedList1 = " + linkedList1);
        //         System.out.println("silme islemi basarili");
        //     }
        // }
        // yani hem bana elindeki tespihi çevir diyorsun, hem de bir yandan
        // tespih tanelerini eksiltiyorsun gibi sanırım - Zeynep hanim

        // if (linkedList1.contains(istenen)) {
        //    linkedList1.remove(istenen);
        //    System.out.println("silme islemi basarili");
        //} else System.out.println("girdiginiz eleman list te yok");

        //or
        Iterator<String> iterator1 = linkedList1.iterator();
        while (iterator1.hasNext()) {

            if (iterator1.next().equals(istenen)) {
                iterator1.remove();
            }
        }
        System.out.println("linkedList1 = " + linkedList1);
    }
}

