package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterators {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));

        System.out.println("ilk hali " + list1);

        Iterator<String> iteratorList = list1.iterator();

       while (iteratorList.hasNext()){
           iteratorList.next();
           iteratorList.remove();
       }
        System.out.println("son hali "+ list1);


    }
}
