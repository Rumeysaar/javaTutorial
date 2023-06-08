package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        int a = 3;

        if (a > 0)
            System.out.println("sayi pozitiftir");
        else {
            System.out.println("sayi negatif");
        }

       String sonuc = a>0 ?  "pozitif" :  "negatif";
        //System.out.println(sonuc);

        System.out.println( a>0 ?  "pozitif" :  "negatif");


        int c =3;
        int b = 5;

        System.out.println(c<b ? "c" : "b" );

        int d =-1;
        int abs = d < 0 ? (d*-1) : d;
        System.out.println("abs = " + abs);

        int sayi1 = 3;
        int sayi2 = -2;

        Object obj = sayi1>0 & sayi2>0 || sayi1<0 &sayi2<0 ? sayi1*sayi2 : "islem yapamam";
        System.out.println("obj = " + obj);

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        String sonc = sayi % 2 == 0 ? "cift sayi" : "tek sayi";
        System.out.println("sonc = " + sonc);







    }
}
