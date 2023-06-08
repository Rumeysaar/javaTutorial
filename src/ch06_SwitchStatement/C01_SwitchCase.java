package ch06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int rakam = input.nextInt();

        if (rakam == 0)
            System.out.println("sifir");
        else if (rakam == 1) {
            System.out.println("bir");
        } else if (rakam == 2) {
            System.out.println("iki");
        }else System.out.println("0-2 arasinda bir rakam girmelisiniz");

        //switch ile

        switch (rakam) {
            case 0 :
                System.out.println("sifir");
                break;
            case 1 :
                System.out.println("bir");
                break;
            case 2 :
                System.out.println("iki");
                break;
            default:
                System.out.println("0-2 arasinda bir rakam girmelisiniz");
        }

    }
}
