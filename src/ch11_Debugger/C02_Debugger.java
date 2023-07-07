package ch11_Debugger;

import java.util.Scanner;

public class C02_Debugger {
// buradaki methodlari ayri bi classa alip switchler icin de ayri bi class alip run edin !!
    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 2;

    public static void main(String[] args) throws InterruptedException {

        sifreKontrol();



    }

    private static void sifreKontrol() throws InterruptedException {
        System.out.println("sifre giriniz");
        String sifre = input.nextLine();

        while (count > 0){
            if (sifre.equals(password)){
                Thread.sleep(200);
                System.out.println("*");
                Thread.sleep(200);
                System.out.println("**");
                Thread.sleep(200);
                System.out.println("***");
                Thread.sleep(2000);
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
                bakiyeSorgula();
                anaMenu();
                break;
            case 2 :
                paraYatir();
                anaMenu();
                break;
            case 3 :
                paraCekma();
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

    private static void paraCekma() {
        System.out.println("bakiye = " + bakiye);
        System.out.println("Cekilmak istenen miktar");
        double cekMiktar = input.nextDouble();

        if (cekMiktar > bakiye){
            System.out.println("yetersiz bakiye");
        }
        else {
            System.out.println("cekilmek istenen miktar " + cekMiktar);
            System.out.println("bu tutari onayliyor musunuz?");
           // boolean yesNo = Boolean.parseBoolean(input.nextLine());   to do cevabi almak
            bakiye -= cekMiktar;
            System.out.println("guncel bakiye " + bakiye);

        }
    }

    private static void paraYatir() {
        System.out.println("bakiye = " + bakiye);
        System.out.println("yatirilmak istenen miktar");
        double yatirMiktar = input.nextDouble();
        bakiye += yatirMiktar;
        System.out.println("guncel bakiye = " + bakiye);
    }

    private static void bakiyeSorgula() {
        System.out.println("guncel bakiye = " + bakiye);
    }
}
