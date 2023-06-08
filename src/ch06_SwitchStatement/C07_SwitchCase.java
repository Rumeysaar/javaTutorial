package ch06_SwitchStatement;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("gun giriniz");

        String gun = input.nextLine().toUpperCase();
        System.out.println("gun = " + gun);

        switch (gun){
            case "PAZARTESI" :
            case "SALI" :
            case "CARSAMBA" :
            case "PERSEMBE" :
            case "CUMA" :
                System.out.println("haftaici");
                break;
            case "CUMARTESI" :
            case "PAZAR" :
                System.out.println("haftasonu");
                break;






        }









    }
}
