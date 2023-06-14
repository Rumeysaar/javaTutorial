package ch09_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = input.nextInt();

        boolean asalMi = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.println(sayi + " asal degil");
                asalMi = false;
                break;
            }
        }
        if (asalMi & sayi != 1){
            System.out.println(sayi + " asal sayidir");
        }else System.out.println(sayi + " asal degil");










    }
}
