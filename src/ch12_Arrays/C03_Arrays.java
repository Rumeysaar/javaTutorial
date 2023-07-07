package ch12_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        String str = " tam oturmasi icin birkac ornek daha gerekir ";

        System.out.println(str);
        String [] yeniArr = str.trim().split(" "); // string array e cevrildi
        System.out.println(Arrays.toString(yeniArr));



        System.out.println("yeniArr.length = " + yeniArr.length);
        System.out.println("str.length() = " + str.length());

        String bosluksuz = str.replaceAll(" ", "");
        System.out.println("bosluksuz = " + bosluksuz);

        String [] arrBosluksuz = bosluksuz.split("");
        System.out.println("arrBosluksuz = " + Arrays.toString(arrBosluksuz));


    }
}
