package ch17_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue_Reference {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("operasyon oncesi list = " + list);

        ListUpdate1(list);
        System.out.println("list update 1 metodu calisti");

        ListUpdate2(list);
        System.out.println("list update 2 metodu calisti");

        System.out.println("operasyon sonrasi list = " + list);










    }

    private static void ListUpdate2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
        System.out.println("update2 metodu icinde list = " + list);
    }

    private static void ListUpdate1(List<Integer> list) {
        for (Integer w : list) {
            w += 2;
        }
        System.out.println("update1 metodu icinde list = " + list);
    }
}
