package ch21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
        C01_Ogretmen.okul="ataturk ilkokulu";
        C01_Ogretmen ogretmen = new C01_Ogretmen("mustafa bey", 35);
        System.out.println("ogretmen = " + ogretmen);
        System.out.println("ogretmen.isim = " + ogretmen.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);

        System.out.println("ogretmen.okul = " + ogretmen.okul);
        //okul static oldugu icin objeden call edilmemeli

        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);
        //olmasi gereken

        C01_Ogretmen.okul="yildiz teknik ilkokulu";
        C01_Ogretmen ogretmen2 = new C01_Ogretmen("zeynep hanim", 35);
        System.out.println("ogretmen = " + ogretmen2);
        System.out.println("ogretmen.isim = " + ogretmen2.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen2.tecrube);

        System.out.println("ogretmen.okul = " + ogretmen2.okul);

        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);

        C01_Ogretmen.maasHesapla();
        ogretmen2.evlilikYildonumu();



    }
}
