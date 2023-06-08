package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("sayi giriniz");
        int sayi2 = scan.nextInt();

        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;
        int bolum = sayi1 / sayi2;
        int carpim = sayi1 * sayi2;

        System.out.println("hangi islem sonucunu gormek istersin?" + "\n toplama icin 1'e" + "\n cikarma icin 2'ye" + "\n bolme icin 3'e" + "\n carpma icin 4'e basin");
        int secim = scan.nextInt();

        if (secim == 1){
            System.out.println("toplam = " + toplam);
        } else if (secim == 2) {
            System.out.println("fark = " + fark);
        } else if (secim == 3) {
            System.out.println("bolum = " + bolum);
        } else if (secim == 4) {
            System.out.println("carpim = " + carpim);
        }else {
            System.out.println("gecersiz islem");
        }


    }
}
