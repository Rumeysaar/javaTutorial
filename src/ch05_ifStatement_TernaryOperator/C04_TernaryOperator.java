package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen  pozitof bir tamsayının 2 veya daha fazla
        // basamaklı olmasını
        // kontrol eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("pozitif bir tam sayi giriniz");

        int sayi = input.nextInt();

        if (sayi<0){
            System.out.println("negatif bir sayi girdiniz");
        } else if (sayi >= 10) {
            System.out.println("girdiginiz sayi 2 veya daha fazla basamakli");
        }else {
            System.out.println("girdiginiz sayi tek basamakli");
        }








    }
}

