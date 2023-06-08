package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        String result = sayi >=0 ? (sayi < 10 ? "rakam" : "pozitif tam sayi") : "negatif sayi";
        System.out.println("result = " + result);





    }
}
