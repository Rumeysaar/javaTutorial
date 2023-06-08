package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("urun miktari giriniz");
        int urunMiktar = scan.nextInt();

        System.out.println("urun birim fiyati giriniz");
        int urunFiyat = scan.nextInt();

        double fatura = urunMiktar > 100 ? (urunFiyat*urunMiktar*0.67) : (urunFiyat*urunMiktar);
        System.out.println("fatura = " + fatura);





    }
}
