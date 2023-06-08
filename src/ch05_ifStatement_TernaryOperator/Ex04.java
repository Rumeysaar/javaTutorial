package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        char ilkKarakter = scan.next().charAt(0);

        if (ilkKarakter>= 'A' && ilkKarakter <= 'Z' || ilkKarakter >= 'a' && ilkKarakter <= 'z') {
            System.out.println("girilen ifadenin ilk karakteri harftir" + " " + ilkKarakter);

        }
        else {
            System.out.println("girilen ifadenin ilk karakteri harf degildir = " + ilkKarakter);
        }






    }
}
