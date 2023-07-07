package ch15_Varargs;

import java.util.Arrays;

public class C01_Varargs {
    public static void main(String[] args) {

        int sayi1 = 99;
        int sayi2 = 15;
        int sayi3 = 55;
        int sayi4 = 35;

        topla(sayi1, sayi2);
        topla(sayi3, sayi4);
        topla(sayi3, sayi4, sayi1);

        System.out.println("varargs ile");
        toplaVarargs(sayi1, sayi2, sayi4, 33);

        // Task -> verilen String'lerin en fazla karaktere sahip olanı print eden
        // METHOD create ediniz->>
        // parametre saysı belirli değil : varargs

        String str1 = "java";
        String str2 = "react";
        String str3 = "spring";
        String str4 = "next.js";
        String str5 = "aws";

        enFazlaKarakter(str1, str5);
        enFazlaKarakter(str1,str2, str3);
        enFazlaKarakter(str1, str5, str4, str3, str2);
        enFazlaKarakter(str1, str4, str3, str5);



    }

    private static void enFazlaKarakter(String...str) {
        String enFazlaKarakter = "" ;
        for (String w: str) {
            if (w.length() > enFazlaKarakter.length()){
                enFazlaKarakter = w;
            }
        }
        System.out.println("enFazlaKarakter = " + enFazlaKarakter);
    }

    private static void toplaVarargs(int... i) {
        System.out.println(Arrays.toString(i));
        int toplam = 0;
        for (int w : i) {
            toplam += w;
        }
        System.out.println(toplam);
    }

    private static void topla(int s, int ss, int sss) {
        System.out.println("3 sayinin toplami =" + (s+ss+sss));
    }

    private static void topla(int s, int d) {
        System.out.println("iki ssayinin toplami =" + (s+d));
    }
}
