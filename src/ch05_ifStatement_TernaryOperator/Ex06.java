package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {


    public static void main(String[] args) {

        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...

         */

        Scanner input = new Scanner(System.in);
        System.out.println("cinsiyetiniz?");
        String cinsiyet = input.nextLine();
        System.out.println("yasiniz?");
        int yas = input.nextInt();
        System.out.println("prim gunuz?");
        int prim = input.nextInt();


        if (cinsiyet.equals ("kadin") & yas >= 60 && prim >= 6000) {
            System.out.println("emekli olabilirsiniz");
        } else if (cinsiyet.equals("kadin") & yas <60 & prim < 6000) {
            System.out.println("kalan yil = " + (60-yas) + "\nkalan prim = " + (6000 - prim));
        }
        if (cinsiyet.equals("erkek") & yas >= 65 && prim >= 7000) {
            System.out.println("emekli olabilirsiniz");
        }else if (cinsiyet.equals("erkek") & yas <65 & prim < 7000) {
            System.out.println("kalan yil = " + (65-yas) + "\nkalan prim = " + (7000 - prim));
        }


    }
    }

