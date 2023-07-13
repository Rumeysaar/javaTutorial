package ch20_Constructor;

public class C07_Ogretmen {

    String isim ;
    int tecrube ;
    int kidem ;

    public C07_Ogretmen(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void kidemHesapla(int kidem){
        System.out.println("kidem = " + (kidem*2));
        System.out.println("this.kidem = " + this.kidem);
    }

}
