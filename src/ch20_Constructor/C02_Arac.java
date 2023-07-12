package ch20_Constructor;

public class C02_Arac {

    //fields

    String marka ;
    String model ;
    int km;
    double motorHacmi;
    boolean vitesAuto;
    boolean ikinciEl;
    int yil;
    String tramer;

    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac();
        arac1.ikinciEl =true;
        arac1.marka = "mercedes";
        arac1.km = 50000;
        arac1.model = "CLA";
        arac1.motorHacmi = 2.0;
        arac1.tramer = "5 kazali";
        arac1.yil = 2022;

        System.out.println(arac1); // ref degeri

        System.out.println(arac1.marka + " " + arac1.tramer + " " + arac1.km);

        //Ali beyin araci
        C02_Arac arac2 = new C02_Arac();
        arac2.ikinciEl = false;
        arac2.marka = "BMW";
        arac2.km = 105000;
        arac2.model = "M3";
        arac2.motorHacmi = 3.5;
        arac2.tramer = " kaza yok";

        System.out.println("arac2 = " + arac2);


    }

    @Override // main metod disi class ici - sag click - generate - toString
    // = heap bellekten veri almak icin
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                ", tramer='" + tramer + '\'' +
                '}';
    }


}


