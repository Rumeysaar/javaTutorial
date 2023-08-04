package ch30_Collections.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {

        String[] arr = {"Adana", "Urfa", "Izmir", " Konya" };

        arrayConvertToList(arr);

        HashSet<String> hashSet = new HashSet<>(arrayConvertToList(arr));
        System.out.println("hashSet = " + hashSet);

        LinkedHashSet<String> linkList = new LinkedHashSet<>(arrayConvertToList(arr));
        System.out.println("linkList = " + linkList);

        TreeSet<String> ts = new TreeSet<>(arrayConvertToList(arr));
        System.out.println("ts = " + ts);

    }

    private static ArrayList<String> arrayConvertToList(String[] arr) {
        ArrayList<String> arrList = new ArrayList<>(List.of(arr));
        //or //*  ArrayList<String> arr1 = new ArrayList<>(Arrays.asList(arr));
        return arrList;
    }
}
