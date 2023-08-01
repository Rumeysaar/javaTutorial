package ch30_Collections.C01_LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class C02_LinkedList {
    public static void main(String[] args) {

        List<Object> list1 = new LinkedList<>();

        list1.add("elif");
        list1.add(35);
        list1.add('$');

        System.out.println(list1);


    }
}
