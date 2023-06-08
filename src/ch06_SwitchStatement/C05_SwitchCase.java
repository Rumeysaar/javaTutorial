package ch06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ay numarasi giriniz");
        int ay = input.nextInt();

        switch (ay){
            default:
                System.out.println("1-12 arasi bir deger giriniz");
                break;
            case 1 :
            case 2 :
            case 12 :
                System.out.println("kis");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("ilkbahar");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("sonbahar");
                break;






        }









    }
}
