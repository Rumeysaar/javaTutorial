package ch09_Break_Continue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        int toplam = 0;
        int count = 0;

        while (count < 7){
            System.out.println("bir tam sayi giriniz");
            int sayi = input.nextInt();
            if (sayi >= 10 & sayi <=20) {
                count++;
                continue;
            }
            toplam += sayi;
            count++;
        }
        System.out.println("10 ile 20 arasi haric girilen sayilarin toplami " + toplam);









    }
}
