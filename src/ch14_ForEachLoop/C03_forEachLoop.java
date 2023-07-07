package ch14_ForEachLoop;

import java.util.ArrayList;

public class C03_forEachLoop {
    public static void main(String[] args) {

        String [] arr1 = {"Zerrin", "Fatih","Mustafa","Zeynep", "Iclal","Musa","Kasim","John"};
        String [] arr2 = {"Christina", "Bale","Mustafa","Zeynep", "Iclal","Moossa","Reese","Angel"};


        ArrayList<String> ortak = new ArrayList<>();
        for (String isim: arr1) {
            for (String isim2: arr2) {
                if (isim.equals(isim2))
                    ortak.add(isim);
            }
        }
        if (ortak.isEmpty())
            System.out.println("ortak isim yok");
        else
            System.out.println(ortak);





    }
}
