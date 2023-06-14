package ch09_Break_Continue;

import java.util.Scanner;

public class C01_break {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String mail = input.nextLine();

        for (int i = 0; i < mail.length() ; i++) {
            if (mail.charAt(i) == '@'){
                break;
            }
            System.out.print(mail.charAt(i));
        }









    }
}
