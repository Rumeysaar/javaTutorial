package ch07_StringManipulations;

import java.util.Scanner;

public class C03_charAt {
    public static void main(String[] args) {

        String city = "Istanbul";
        System.out.println("city.charAt(0) = " + city.charAt(0));


        System.out.println("city.charAt(1) = " + city.charAt(1));
        char city1Index = city.charAt(1);

        System.out.println(city1Index);

        System.out.println("son karakter = " + city.charAt(city.length() - 1));

        char ch = city.charAt(city.length()-1);
        System.out.println("ch = " + ch);

        System.out.println("city.charAt(21) = " + city.charAt(2));

        System.out.println("city.charAt(city.length()/2) = " + city.charAt(city.length()/2));

        Scanner input = new Scanner(System.in);
        System.out.println("bir sehir ismi giriniz");
        String city2 = input.nextLine();

        if (city2.length() % 2 == 0)
            System.out.println("ortanca harf yok");
        else
            System.out.println("ortanca harf = " + city2.charAt(city2.length() / 2));

    }
}
