package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C04_Previous {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("numberList ilk hali = " + numberList);

        ListIterator<Integer> itr = numberList.listIterator();

        while (itr.hasNext()) {
            itr.next();
        }

        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }

        System.out.println();

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));
        System.out.println("list1 in ilk hali  = " + list1);


        ListIterator<String> listIt1 = list1.listIterator();

        while (listIt1.hasNext()){
            String str = listIt1.next();
            System.out.println("str = "+ str);

            if (!listIt1.hasNext()){ // false olana kadar
                listIt1.set(str + " SDET");
            }
        }

        System.out.println("list1 son hali = " + list1);


    }


}

