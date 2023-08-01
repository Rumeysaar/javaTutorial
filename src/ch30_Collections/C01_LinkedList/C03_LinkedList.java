package ch30_Collections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 =new LinkedList<>(Arrays.asList("Berlin","Ankara","Izmir","Dortmund","Istanbul","NewYork"));
        System.out.println(linkedList1);

        System.out.println("linkedList1.remove() = " + linkedList1.remove());
        System.out.println("linkedList1.remove(2) = " + linkedList1.remove(2));
        System.out.println(linkedList1);
        System.out.println("linkedList1.remove(\"Dortmund\") = " + linkedList1.remove("Dortmund"));

        linkedList1.add("Izmir");
        System.out.println("linkedList1 = " + linkedList1);
        System.out.println("linkedList1.removeFirstOccurrence(\"Izmir\") = " + linkedList1.removeFirstOccurrence("Izmir"));
        System.out.println("linkedList1 = " + linkedList1);
        System.out.println("linkedList1.element() = " + linkedList1.element());

        System.out.println("linkedList1.getLast() = " + linkedList1.getLast());
        System.out.println("linkedList1.getFirst() = " + linkedList1.getFirst());

        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("bilecik","menemen","dortmund","istanbul"));
        LinkedList<String> linkedList3 = new LinkedList<>(Arrays.asList("hatay","dublin","paris","konya"));
        linkedList2.addAll(linkedList3);
        System.out.println("linkedList2 = " + linkedList2);

        linkedList2.removeAll(linkedList3);
        System.out.println("linkedList2 = " + linkedList2);

        List<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("list1 = " + list1);
        System.out.println("list1.remove(2) = " + list1.remove(2));


    }
}
