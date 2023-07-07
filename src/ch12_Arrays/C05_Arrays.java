package ch12_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        int [] sayi = {2,34,45,67,88,65,2,90};
        int yeniArr[] = Arrays.copyOf(sayi, 12);

        System.out.println(Arrays.toString(yeniArr));

        int rangeArr [] = Arrays.copyOfRange(sayi, 5, 12);
        System.out.println(Arrays.toString(rangeArr));

        Arrays.fill(rangeArr,5);
        System.out.println(Arrays.toString(rangeArr));

        Arrays.fill(rangeArr,2,5,0);
        System.out.println(Arrays.toString(rangeArr));






    }
}
