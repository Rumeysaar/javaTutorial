package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> names = new ArrayList<>(List.of("Ali", "Serap", "Zeynep", "Fuat"));
        ArrayList<String> newNames = new ArrayList<>();


        for (int i = 0; i < names.size(); i++) {
            if (!names.get(i).toLowerCase().contains("a")){
                newNames.add(names.get(i));
            }
        }
        System.out.println("newNames = " + newNames);

    }

}
