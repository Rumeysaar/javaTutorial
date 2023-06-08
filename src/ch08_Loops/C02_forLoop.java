package ch08_Loops;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("100'e kadar pozitif bir tam sayi giriniz");
        int a = input.nextInt();



        if (a<0 | a>100)
            System.out.println("hatali giris");
        else {

            for (int i = a; i < 101; i++) {
                if (i % 4 == 0)
                    System.out.println(i);
            }
        }








    }
}
