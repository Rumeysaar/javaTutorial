package ch06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase_ATMProject {

    static String password = "12345";
    public static void main(String[] args) {
         /*
     Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
     çıkış işlemlerinin yapıldıgı bir
     ATM app. code create ediniz
     */

        Scanner input = new Scanner(System.in);
        System.out.println("*** Blabla Bank ATM hosgelddiniz ***");
        System.out.println("Sifreniz");
        String sifre = input.nextLine();

        if (sifre.equals(password)) {
            System.out.println("sifre dogru");

            System.out.println("bakiye sorgulama icin 1 \npara yatirma islemleri icin 2 " +
                    "\npara cekme islemleri icin 3 \ncikis icn 4 'e basin");
            int secim = input.nextInt();
            int bakiye = 1000;

            switch (secim) {
                case 1 :
                    System.out.println("bakiye = " + bakiye);
                    break;
                case 2 :
                    System.out.println("yatirmak istenilen miktar");
                    int miktar = input.nextInt();
                    bakiye += miktar;
                    System.out.println("mevcut bakiye = " + bakiye);
                    break;
                case 3 :
                    System.out.println("cekmek istenilen miktar");
                    int cekMiktar = input.nextInt();
                    if (cekMiktar <= bakiye) {
                        bakiye -= cekMiktar;
                        System.out.println("cekilen Miktar = " + cekMiktar);
                        System.out.println("kalan bakiye = " + bakiye);
                    }else System.out.println("yetersiz bakiye " + " bakiye = " + bakiye);
                    break;
                case 4 :
                    System.out.println("cikis yapildi");
                    break;
                default:
                    System.out.println("hatali tuslama");
                    break;


            }


        }else System.out.println("hatali sifre \n kalan deneme 2");




    }
}
