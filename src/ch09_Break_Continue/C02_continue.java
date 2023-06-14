package ch09_Break_Continue;

import java.util.Scanner;

public class C02_continue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String mail = input.nextLine();

        for (int i = 0; i <mail.length() ; i++) {
            char ch = mail.charAt(i);
            if (ch == ' ') {
                continue;
            }
            System.out.print(ch);
        }






    }
}
