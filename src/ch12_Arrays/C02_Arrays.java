package ch12_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int [] numbers = {12,13,55,66,35,3,4,34,33,63,72};

        int istenenSayi = 35;

        int count = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == istenenSayi){
                count++;
                flag = true;
                break;
            }
        }

        if (count >= 1){
            System.out.println("istenen sayi mevcut " + istenenSayi);
        }else
            System.out.println("istenen sayi mevcut degil");

        System.out.println("istenilen sayinin adedi = " + count);

        if (flag){
            System.out.println("istenilen sayi mevcut");
        }else
            System.out.println("istenen sayi mevcut degil");

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, istenenSayi));


    }
}
