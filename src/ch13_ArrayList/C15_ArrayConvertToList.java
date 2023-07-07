package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertToList {
    public static void main(String[] args) {

        String [] names = {"Ali", "Zeynep", "Fatih", "Safak", "Derya"};

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        List<String> namesList = Arrays.asList(names);
        System.out.println("namesList = " + namesList);
        // arrayi liste cevirdigimiz icin ekleme cikarma yapilamaz.

        ArrayList<String> nameArrayList = new ArrayList<> (Arrays.asList(names));
        //new ile list yapilabilir
        System.out.println("nameArrayList = " + nameArrayList);
    }
}
