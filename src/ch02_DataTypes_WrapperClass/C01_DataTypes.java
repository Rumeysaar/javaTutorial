package ch02_DataTypes_WrapperClass;

public class C01_DataTypes {


    public static void main(String[] args) {


        String name = "Hasan";
        String yas = "23";
        int age =36;
        int yil = 2023;
        boolean emekliMi = false;
        boolean testerMi = true;
        char ch = 'a'; //char icin tek karakter girilir yoksa hata verir (too many characters in character literal)
        char harf = 'A';

       int dogumTarihi = 1999;
       int bugunTarih = 2023;
       int yasiniz = bugunTarih - dogumTarihi;
        System.out.println("yasiniz = " + yasiniz);

        float f1 = 12.45f;
        float f2 = 15.45f;

        double d = 25.55;
        System.out.println("f1*f2 = " + f1 * f2);

        byte sayi1 = 100;
        byte sayi2 = 29;
        byte toplam = (byte) (sayi1+sayi2);
        System.out.println("toplam = " + toplam);

        byte sayi3 = 100;
        byte sayi4 = 50;
        System.out.println(sayi3-sayi4);

        int sayi5 = 2345;
        byte sayi6 = 50;
        System.out.println("sayi6 + sayi5 = " +(sayi6+sayi5));
        System.out.println("sayi6+sayi5 = " + sayi6+sayi5);   // toplama islemlerinde parantes () icine alinmazsa
        // sayilari toplamak yerine yanyana yazar

        int sayia = 10;
        double sayib = 10.5;
        System.out.println(sayia + sayib);


        int sayi7 = 45;
        char para = '$';
        System.out.println(sayi7 + para); // $ isaretinin ascii degeri 
        System.out.println("sayi7+para = " + sayi7+para); // sayi7+para = 45$ concatination


        String adi = "Rumeysa";
        String soyad = "A";
        int yasi = 28;

        System.out.println(adi + soyad + " "+ yasi);

        //concatination - birlestirme
        System.out.println("concatination");
        System.out.println(adi + "\n"+soyad+"\n"+"\t"+ yasi);

        System.out.println(     '('    + 1   +  " "  +  1  +  ')'    );  // 41 1)
        // string bir degerden oncekiler toplanir sonrakiler concat edilir







    }
}

