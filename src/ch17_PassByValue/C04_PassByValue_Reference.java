package ch17_PassByValue;

public class C04_PassByValue_Reference {
    static double etiketFiyat ;
    static double indirimOrani ;
    public static void main(String[] args) {

        etiketFiyat =100;
        System.out.println("metod call oncesi etiketFiyat = " + etiketFiyat);

        indirimOrani = 0.1;

        indir();
        indir();
        indir();
        System.out.println("metod sonraisi etiket fiyat = " + etiketFiyat);



    }

    private static void indir() {
        etiketFiyat *= (1- indirimOrani);
        System.out.println("etiket Fiyati metod icinden = " + etiketFiyat);
    }
}
