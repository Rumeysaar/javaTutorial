package ch10_MethodCreation;

import java.util.Scanner;

public class C08_AtmProject {

    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 3;

    public static void main(String[] args) {

        sifreKontrol();



    }

    private static void sifreKontrol() {
        System.out.println("sifre giriniz");
        String sifre = input.nextLine();

        while (count > 0){
            if (sifre.equals(password)){
               anaMenu();
                break;
            }else {
                System.out.println("yanlis sifre");
                sifre = input.nextLine();
                count--;
                if (count == 0){
                    System.out.println("blocked");
                    break;
                }
            }
        }



    }

    private static void anaMenu() {
        System.out.println("bakiye sorgulama icin 1 \n para yatirma icin 2 \n " +
                "para cekme icin 3 \n cikis icin 4'e basiniz");
        int secim = input.nextInt();

        switch (secim){
            case 1 :
               // bakiyeSorgula();
                anaMenu();
                break;
            case 2 :
                //paraYatir();
                anaMenu();
                break;
            case 3 :
                //paraCekma();
                anaMenu();
                break;
            case 4 :
                //cikis();
                break;
            default:
                System.out.println("hatali giris");
                anaMenu();
                break;

        }
    }
}
