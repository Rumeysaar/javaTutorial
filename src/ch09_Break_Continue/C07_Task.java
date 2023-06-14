package ch09_Break_Continue;

import java.util.Scanner;

public class C07_Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String str = input.nextLine();

        int count = 0;

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
            if (str.charAt(i) == 'c') {
                break;
            }
        }
            System.out.print("a harfi sayisi " + count);









    }
}
