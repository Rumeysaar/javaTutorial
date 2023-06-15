package ch10_MethodCreation;

import java.util.Scanner;

public class C07_Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String kelime = input.nextLine();

        palindrome(kelime);







    }

    private static void palindrome(String k) {
        String ters = "";
        for (int i = k.length()-1; i >= 0; i--) {
            ters += k.charAt(i);
        }
            System.out.println("kelimenin tersi " + ters);
            if (ters.equals(k)) {
                System.out.println("palindromedur");
            } else
                System.out.println("palindrome degildir");
    }



}

