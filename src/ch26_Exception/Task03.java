package ch26_Exception;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int vize = 0;
        int finl = 0;

        Scanner input = new Scanner(System.in);



        while (true) {
            try {
                System.out.println("vize notu giriniz");
                vize = input.nextInt();
                if (vize < 0 || vize > 100) {
                    throw new ArithmeticException();
                }else break;
            }catch (ArithmeticException e){
                System.out.println("Notlar 0-100 arasında olmalı" );
            }
        }
        while (true) {
            try {
                System.out.println("final notu giriniz");
                finl = input.nextInt();
                if (finl < 0 || finl > 100) {
                    throw new ArithmeticException();
                }else break;
            }catch (ArithmeticException e){
                System.out.println("Notlar 0-100 arasında olmalı" );
            }
        }

        ortalama(vize,finl);



    }
    public static void ortalama (int v, int f){

          double ortalama = (v*0.4) + (f*0.6);
        System.out.println("ortalama = " + ortalama);
        if (ortalama >= 65){
              System.out.println("gecti");
          }else System.out.println("kaldin");

    }
}
