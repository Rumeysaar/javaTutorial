package ch07_StringManipulations;

import java.util.Scanner;

public class C09_replace_replaceAll {
    public static void main(String[] args) {

        String str = "ezberlemek beyne ihanettir 123456 ˆ%$#@ () : ";

        System.out.println("str.replace('a', '$') = " + str.replace('a', '$'));
        System.out.println("str.replaceFirst(\"e\" , \"*\") = " + str.replaceFirst("e", "*"));

        System.out.println("str.replaceAll(\"\\\\w\", \"*\") = " + str.replaceAll("\\w", "*"));
        System.out.println("str.replaceAll(\"\\\\W\" , \"*\") = " + str.replaceAll("\\W", "*"));

        System.out.println("str.replaceAll(\"[A-Z a-z]\", \"*\") = " + str.replaceAll("[A-Z a-z]", "*"));

        Scanner input = new Scanner(System.in);
        System.out.println("isim");
        String name = input.nextLine();
        System.out.println("soyisim");
        String surname = input.nextLine();
        System.out.println("16 haneli banka numaraniz");
        String num = input.nextLine();

        String newname = name.charAt(0)+name.substring(1).replaceAll("\\w","*");
        System.out.println(newname);

        System.out.println(surname.charAt(0) + surname.substring(1).replaceAll("\\w", "*"));

        String num1 = "**** **** **** " + num.substring(12);
        System.out.println(num1);
        //or

        System.out.println(num.substring(0, 12).replaceAll("[0-9]", "*") + num.substring(12));





    }
}
