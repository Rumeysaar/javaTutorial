package ch07_StringManipulations;

import java.util.Scanner;

public class C06_substring {
    public static void main(String[] args) {

        String str = "Calistikca daha cok sey bilmedigimi farkediyorum";

       // System.out.println("str.substring(0,5) = " + str.substring(0, 5));
        System.out.println(str.substring(str.length() - 12));

        System.out.println(str.substring(0, 10)); // ilk 10 karakteri yazdirmak icin

        System.out.println(str.charAt(0));

        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir kelime girin");
        String word = input.nextLine();

       if (word.length()!=4)
           System.out.println("4 harfli bir kelime girin");
       else {
           System.out.print(word.substring(word.length() - 1));
           System.out.print(word.charAt(word.length() - 2));
           System.out.print(word.charAt(word.length() - 3));
           System.out.println(word.substring(0, 1));
       }

        //if (kelime.length()==4){
        //    System.out.print(kelime.substring(kelime.length() - 1));
        //    System.out.print(kelime.substring(kelime.length() - 2, kelime.length() - 1));
        //    System.out.print(kelime.substring(kelime.length()-3,kelime.length()-2));
        //    System.out.print(kelime.substring(0, 1));
        //}else {
        //    System.out.println("4 harfli bir kelime girin");
        //}

       }
}
