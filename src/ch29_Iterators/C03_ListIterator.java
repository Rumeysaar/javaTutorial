package ch29_Iterators;

import java.util.*;

public class C03_ListIterator {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));

        System.out.println("ilk hali " + list1);

        ListIterator<String> iteratorList = list1.listIterator();

        while (iteratorList.hasNext()){
            iteratorList.set(iteratorList.next() + " SDET");
        }
        System.out.println("son hali "+ list1);

        List<String> list2 = new ArrayList<>(Arrays.asList("offer geliyo"));

        ListIterator<String> itr1 = list1.listIterator();

        while (itr1.hasNext()){
            itr1.set(itr1.next().toUpperCase().charAt(0) + "****");
            itr1.add(list2.toString());
        }
        System.out.println("list2 son = " + list2);

        System.out.println("list1 son = " + list1);


    }
}
