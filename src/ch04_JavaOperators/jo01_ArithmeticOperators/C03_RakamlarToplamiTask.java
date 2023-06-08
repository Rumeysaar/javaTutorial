package ch04_JavaOperators.jo01_ArithmeticOperators;

import java.util.Scanner;

public class C03_RakamlarToplamiTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("3 basamakli bir sayi girin");

        int sayi = input.nextInt();

        int a = sayi%10;
        int b = (sayi/10)%10;
        int c = (sayi/100)%10;

        System.out.println("rakamlari toplami = " + (c + a + b));








    }
}
