package ch26_Exception;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("password?");
        String passw = input.nextLine();

        try {
            if (passw.length()<6 || passw.length() > 10){
                throw new StringIndexOutOfBoundsException();
            }else System.out.println("sifre kabul edildi " + passw);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("hatali giris");
        }

        System.out.println("sistem calisiyor");



    }
}
