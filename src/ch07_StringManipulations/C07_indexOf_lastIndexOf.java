package ch07_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        String str = "all is well";

        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.indexOf(\"l\") = " + str.indexOf("l"));

        System.out.println("str.indexOf(\"well\") = " + str.indexOf("well"));
        System.out.println("str.indexOf(\"is\") = " + str.indexOf("is"));
        System.out.println("str.indexOf(\"LL\") = " + str.indexOf("LL")); //-1

        String name = "Jack Nicholson";

        System.out.println("name.indexOf(\"k\") = " + name.indexOf("k"));
        System.out.println("name.lastIndexOf(\"k\") = " + name.lastIndexOf("k"));

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = input.nextLine().toLowerCase();

        if (cumle.indexOf("java") == -1)
            System.out.println("Girilen cumle java icermiyor");
        else if (cumle.indexOf("java")== cumle.lastIndexOf("java")) {
            System.out.println("Girilen cumle 1 tane java iceriyor");
        }
        else System.out.println("Girilen cumlede birden fazla java var");




    }
}
