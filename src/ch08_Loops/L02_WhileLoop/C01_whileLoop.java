package ch08_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {

        for (int i = 11; i < 20; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("2. option");

       //int num = 11;
       //while (num < 20){
       //    System.out.print(num + " ");
       //    num++;
       //}

       // for (int i = 0; i < 7; i++) {
       //     System.out.println("javaCan");
       // }
       //System.out.println();
       //int num1 = 1;
       //while (num1 < 8) {
       //    System.out.println("javaCan");
       //    num1++;
       //}

       //int num2 = 11;
       //
        //
        //
        // while (num2 < 100) {
       //
        //
        //
        //    System.out.print(num2 + " ");
       //
        //
        //
        //    num2 += 2;
       //
        //
        //
        // }


       //Scanner input = new Scanner(System.in);
       //System.out.println("bir metin giriniz");
       //String word = input.nextLine();

        //int lenght = word.length() -1;
        //while (lenght >= 0){
        //    System.out.print(word.charAt(lenght));
        //    lenght --;
        //    }
//
        //System.out.println();
        //System.out.println("for ile");
//
        //for (int i = word.length()-1; i >= 0 ; i--) {
        //    System.out.print(word.charAt(i));
//
        //}


        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int number = input.nextInt();

        //int carpim= 1;
        //while (number > 0) {
        //    carpim *= number;
        //    number--;
        //}System.out.println(carpim);

        int fakt = 1;
        while (number > 1){
            fakt *= number;
            number--;
        }
        System.out.println(number);








    }
}
