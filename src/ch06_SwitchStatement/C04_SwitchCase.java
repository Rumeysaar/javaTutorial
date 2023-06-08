package ch06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ay numarasi giriniz ");
        int ay = input.nextInt();

       switch (ay){
           default:
               System.out.println("1-12 arasinda bir deger giriniz");
               break;
           case 1 :
           case 3 :
           case 5 :
           case 7 :
           case 8 :
           case 10 :
           case 12 :
               System.out.println("girilen ayda 31 gun vardir");
               break;
           case 4 :
           case 6 :
           case 9 :
           case 11 :
               System.out.println("girilen ayda 30 gun vardir");
               break;
           case 2 :
               System.out.println("yili giriniz");
               int yil = input.nextInt();

               if ((yil % 4 == 0 && yil % 100 != 0 ) || yil % 400 == 0)
                   System.out.println("bu yil subat 29 gun icerir");
               else System.out.println("bu yil subat 28 gun icerir");

               break;






       }








    }
}
