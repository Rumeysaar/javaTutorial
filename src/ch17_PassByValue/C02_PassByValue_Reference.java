package ch17_PassByValue;

public class C02_PassByValue_Reference {
    public static void main(String[] args) {

        double fiyat = 100;
        System.out.println("metod call oncesi fiyat = " + fiyat);

        System.out.println("indri11(fiyat) = " + indri11(fiyat));
        System.out.println("indri22(fiyat) = " + indri22(fiyat));
        System.out.println("indri33(fiyat) = " + indri33(fiyat));

        System.out.println("metod call sonrasi fiyat = " + fiyat);


    }

    private static double indri33(double fiyat) {
        return fiyat *= 0.67;
    }

    private static double indri22(double fiyat) {
        return fiyat *= 0.78;
    }

    private static double indri11(double fiyat) {
        return fiyat *= 0.89;
    }
}
