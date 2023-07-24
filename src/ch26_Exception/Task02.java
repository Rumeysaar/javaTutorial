package ch26_Exception;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("hava sicakligi ?");
        int derece = input.nextInt();

        try {
            sicaklikKontrol(derece);
        } catch (IOException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }


    }
    private static void sicaklikKontrol(int derece) throws IOException {
        if (derece < 10){
            throw new IOException("sicaklik 10C altinda");
        }else System.out.println("hava sicakligi " + derece);

    }

}
