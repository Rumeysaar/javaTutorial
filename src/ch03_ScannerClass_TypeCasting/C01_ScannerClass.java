package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {


        //Scanner input = new Scanner(System.in);

       // System.out.println("sifreni gir");

       // String sifre = input.nextLine();

       // System.out.println(sifre.replaceAll("\\d", "*"));

      // Scanner input = new Scanner(System.in);

      // System.out.println("karenin kenarini gir"); // kullaniciya kenar girme komutu verildi
      //
      // int kenar = input.nextInt(); // girilen int deger kenar variablea atandi
      //
      // int alan = kenar * kenar;
      //
      // int cevre = kenar * 4;

      // System.out.println("alan = " + alan);

        // System.out.println("cevre = " + cevre);


       // Scanner input = new Scanner(System.in);

        //System.out.println("gunluk cay sayisini gir");
//
        //int caySayisi = input.nextInt();
//
        //System.out.println("caya kac seker atarsin");
//
        //int sekerSayisi = input.nextInt();
//
        //System.out.println("yilda ictigin cay sayisi = "+ (365*caySayisi) +
        //     "yilda tukettigin seker miktari kg olarak = "+ (caySayisi*sekerSayisi*1.7*365)/1000);

       //System.out.println("isminiz nedir");

       //String name = input.nextLine();

       //char ilkHarf = name.charAt(0);
       //System.out.println("ilkHarf = " + ilkHarf);


       //System.out.println("isminizin uzunlugu = " + name.length());

       //char sonHarf = name.charAt(name.length()-1);
       //System.out.println("sonHarf = " + sonHarf);

        int sayi1 = 33 ;
        int sayi2 = 4;

        System.out.println("sayi1/sayi2 = " + (sayi1 / sayi2));

        byte by = 127;
        int number = by;

        int num =123;
        double d1 =14;
        double d2 = d1/num;
        System.out.println("d2 = " + d2);

        double db1 =14.66;
        int i = (int) db1;
        int num3 =150;
        byte by1 = (byte) num3;
        System.out.println("by1 = " + by1);

        Scanner input = new Scanner(System.in);

        System.out.println("bir karakter giriniz");
        char ch = input.nextLine().charAt(0);
        System.out.println("karakter = " + (ch+0));






    }
}
