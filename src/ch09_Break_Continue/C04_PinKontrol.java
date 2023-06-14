package ch09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String sifre = "12345";
        int deneme = 3;

        // for (int i = 0; i < 3 ; i++) {
//
        //     if (password.equals(sifre)) {
        //         System.out.println("giris yapildi");
        //     }else System.out.println("yanlis sifre");
//
        // }

        while (true) {
            System.out.println("sifrenizi giriniz");
            String password = input.nextLine();

            if (password.equals(sifre)) {
                System.out.println("giris yapildi");
                break;
            }else {
                System.out.println();
                deneme--;
                System.out.println("kalan deneme " + deneme);
                if (deneme == 0) {
                    System.out.println("blocked");
                    break;
                }
            }
        }
    }
}

