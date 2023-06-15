package ch10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

        // task-> girilen tam sayının rakamları toplamını
        // print eden METHOD create ediniz


        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = input.nextInt();


        System.out.println(rakamToplami(sayi));

    }
    public static int rakamToplami(int x){
        int rakamToplami = 0;

        while (x > 0){
            rakamToplami += x % 10;
            x /= 10;
        }
        return rakamToplami;
    }




}
