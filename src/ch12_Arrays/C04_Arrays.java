package ch12_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        int sayi1 [] = {39,3,72,63,84};
        int [] sayi2 = {84,72,63,3,39};

        System.out.println("sayi1 = sayi2? = " + Arrays.equals(sayi1, sayi2));

        Arrays.sort(sayi1);
        Arrays.sort(sayi2);
        System.out.println("sayi1 = sayi2? = " + Arrays.equals(sayi1, sayi2));

        System.out.println(sayi1[0] == sayi2[0]);

        String str = Arrays.toString(sayi1);
        System.out.println(str);


    }
}
