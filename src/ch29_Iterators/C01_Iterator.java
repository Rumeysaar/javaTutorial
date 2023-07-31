package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));


        System.out.println("list1 in ilk hali  = " + list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
            String name = list1.get(i);
            list1.set(i, name + " SDET ");
        }
        System.out.println();

        for (String each:list1) {
            System.out.print(each /* + " SDET "*/);// list guncellenmiyor kalici degisiklik yapilmiyor
        }
        System.out.println();

        System.out.println("list1 son hali = " + list1);

        Iterator<String> list1iterator = list1.iterator();
        while (list1iterator.hasNext()) {
            System.out.print(" "+ list1iterator.next());
        }
        System.out.println();

        System.out.println("while sonrasi " + list1iterator);

        System.out.println(list1iterator);//java.util.ArrayList$Itr@6aaa5eb0 ref verir


    }
}