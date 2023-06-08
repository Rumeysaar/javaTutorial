package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("100 uzerinden notunuz");
        int not = input.nextInt();

        if (not <=0) {
            System.out.println("not gecersiz");
        } else if (not<50) {
        System.out.println("notunuz = D");
        } else if (not >=50 & not<60) {
            System.out.println("notunuz = C");
        } else if (not >=60 & not<80) {
            System.out.println("notunuz = B");
        } else if (not>=80& not<=100){
            System.out.println("notunuz = A");
        } else {
            System.out.println("not gecersiz");
        }


    }
}
