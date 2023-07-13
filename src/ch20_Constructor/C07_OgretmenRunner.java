package ch20_Constructor;

public class C07_OgretmenRunner {
    public static void main(String[] args) {
        C07_Ogretmen ogrt = new C07_Ogretmen("Iclal Hanim",25);
        System.out.println("ogrt.isim = " + ogrt.isim);
        System.out.println("ogrt.tecrube = " + ogrt.tecrube);
        System.out.println("ogrt.kidem = " + ogrt.kidem);

        ogrt.kidemHesapla(12);


    }
}
