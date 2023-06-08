package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi<0) {
            System.out.println("sayi negatif");
        }else if (sayi>0){
            System.out.println("sayi pozitif");
        }else {
            System.out.println("sayi nötr");
        }





    }
}
