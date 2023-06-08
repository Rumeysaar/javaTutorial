package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {
        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir"
        // print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");

        int sayi = input.nextInt();

        if (sayi%2 == 0){
            System.out.println(sayi/2);
        }else {
            System.out.println("girilen sayı tek oldugu için yarısı tamsayı değildir");
        }

        //or

        Object result = ((sayi % 2 == 0) ? (sayi/2) : ("girilen sayı tek oldugu için yarısı tamsayı değildir"));

        System.out.println("result = " + result);




    }
}
