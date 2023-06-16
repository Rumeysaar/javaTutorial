package ch10_MethodCreation;

import java.util.Scanner;

public class C09_UcusProject {

    static Scanner input = new Scanner(System.in);
    static double fiyatB = 500 * 0.1;
    static double fiyatC = 700 * 0.1;
    static double fiyatD = 900 * 0.1;

    public static void main(String[] args) {
        System.out.println(" Blavala hava yollarina hosgeldiniz \nB,C,D rotalrindan secim yapiniz");
        String route = input.nextLine().toUpperCase();



        if (route.equals("B") | route.equals("C") | route.equals("D")) {
            System.out.println("gidis-donus indirimli almak isterseniz \n" +
                    "tek yon icin 1 \ncift yon icin 2'ye basiniz");
            int ucusYonu = input.nextInt();

            System.out.println("yasinizi giriniz");
            int yas = input.nextInt();
            if (yas > 65) {
                if (route.equals("B")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("65 yas ustu B rotasi gidis donus fiyat =" + fiyatB * 0.8 * 0.7 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("65 yas ustu B rotasi gidis  fiyat =" + fiyatB * 0.7);
                    } else
                        System.out.println("hatali tuslama");
                } else if (route.equals("C")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("65 yas ustu C rotasi gidis donus fiyat =" + fiyatC * 0.8 * 0.7 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("65 yas ustu C rotasi gidis  fiyat =" + fiyatC * 0.7);
                    } else
                        System.out.println("hatali tuslama");
                } else if (route.equals("D")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("65 yas ustu D rotasi gidis donus fiyat =" + fiyatD * 0.8 * 0.7 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("65 yas ustu D rotasi gidis  fiyat =" + fiyatD * 0.7);
                    } else
                        System.out.println("hatali tuslama");
                } else System.out.println(" 65 yas uzeri hatali rota girisi ");
            }
            else if (yas < 24 & yas >= 12) {
                if (route.equals("B")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("12-24 yas arasi B rotasi gidis donus fiyat =" + fiyatB * 0.9 * 0.8 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("12-24 yas arasi B rotasi gidis  fiyat =" + fiyatB * 0.9);
                    } else
                        System.out.println("hatali tuslama");
                } else if (route.equals("C")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("12-24 yas arasi C rotasi gidis donus fiyat =" + fiyatC * 0.8 * 0.9 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("12-24 yas arasi C rotasi gidis  fiyat =" + fiyatC * 0.9);
                    } else
                        System.out.println("hatali tuslama");
                } else if (route.equals("D")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("12-24 yas arasi D rotasi gidis donus fiyat =" + fiyatD * 0.8 * 0.9 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("12-24 yas arasi D rotasi gidis  fiyat =" + fiyatD * 0.9);
                    } else
                        System.out.println("hatali tuslama");
                } else System.out.println("12-24 yas arasi icin yanlis rota");
            }
            else if (yas < 12) {
                if (route.equals("B")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("12 yas alti B rotasi gidis donus fiyat =" + fiyatB * 0.5 * 0.8 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("12 yas alti B rotasi gidis  fiyat =" + fiyatB * 0.5);
                    } else
                        System.out.println("hatali tuslama");
                } else if (route.equals("C")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("12 yas alti C rotasi gidis donus fiyat =" + fiyatC * 0.8 * 0.5 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("12 yas alti C rotasi gidis  fiyat =" + fiyatC * 0.5);
                    } else
                        System.out.println("hatali tuslama");
                } else if (route.equals("D")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("12 yas alti D rotasi gidis donus fiyat =" + fiyatD * 0.8 * 0.5 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("12 yas alti D rotasi gidis  fiyat =" + fiyatD * 0.5);
                    } else
                        System.out.println("12 yas alti icin hatali tuslama");
                }

            }
            else {// 24 - 65 yas arasi
                if (route.equals("B")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("24 - 65 yas arasi B rotasi gidis donus fiyat =" + fiyatB * 0.8 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("24 - 65 yas arasi B rotasi gidis  fiyat =" + fiyatB);
                    } else
                        System.out.println("hatali tuslama");
                } else if (route.equals("C")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("24 - 65 yas arasi C rotasi gidis donus fiyat =" + fiyatC * 0.8 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("24 - 65 yas arasi C rotasi gidis  fiyat =" + fiyatC);
                    } else
                        System.out.println("hatali tuslama");
                } else if (route.equals("D")) {
                    if (ucusYonu == 2) {
                        System.out.println("fiyat hesaplaniyor");
                        System.out.println("24 - 65 yas arasi D rotasi gidis donus fiyat =" + fiyatD * 0.8 * 2);
                    } else if (ucusYonu == 1) {
                        System.out.println("24 - 65 yas arasi D rotasi gidis  fiyat =" + fiyatD);
                    } else
                        System.out.println("hatali tuslama");
                }
            }


        }
        else System.out.println("hatali giris yaptiniz");
    }
}