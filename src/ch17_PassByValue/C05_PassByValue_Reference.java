package ch17_PassByValue;

public class C05_PassByValue_Reference {
    public static void main(String[] args) {

        double etiketFiyat = 100;
        double indirimOrani = 0.1;

        System.out.println("indirim oncesi etiket Fiyat = " + etiketFiyat);

        etiketFiyat = indirim(etiketFiyat, indirimOrani);

        System.out.println("indirim sonrasi etiket Fiyat = " + etiketFiyat);


    }

    private static double indirim(double etiketFiyat, double indirimOrani) {
        etiketFiyat *= (1-indirimOrani);
        System.out.println(" metod icinden etiket Fiyat = " + etiketFiyat);
        return etiketFiyat;
    }
}
