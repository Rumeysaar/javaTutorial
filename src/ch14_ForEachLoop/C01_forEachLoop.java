package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_forEachLoop {
    public static void main(String[] args) {

        List<Integer> sayiList = new ArrayList<>(List.of(1,2,55,66,33,35,34,72));

        for (Integer w: sayiList) {

            System.out.println(w);
        }

        System.out.println("task 02");

        for (Integer i: sayiList.subList(3,sayiList.size())) {
            if (i % 2 == 1)
                System.out.println(i);
        }

        System.out.println("task 03");

        int toplam = 0;
        for (Integer i:sayiList.subList(2,6)) {
            toplam += i;
        }
        System.out.println(toplam);







    }
}
