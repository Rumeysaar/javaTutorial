package ch30_Collections.C01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList1 =new LinkedList<>(Arrays.asList("Berlin","Ankara","Izmir","Dortmund","Istanbul","NewYork"));
        System.out.println(linkedList1);

        linkedList1.add("Manheim");
        System.out.println(linkedList1);
        linkedList1.add(2,"Sose");
        System.out.println(linkedList1);
        linkedList1.addFirst("Kirikkale");
        System.out.println(linkedList1);
        linkedList1.addLast("son durak");
        System.out.println(linkedList1);

        List<String> list1 = new LinkedList<>();
        List<String> list2 = new ArrayList<>(List.of("almanya","amerika","fransa","hollnada","ingiltere"));
        linkedList1.addAll(list2);
        System.out.println(linkedList1);


    }
}
