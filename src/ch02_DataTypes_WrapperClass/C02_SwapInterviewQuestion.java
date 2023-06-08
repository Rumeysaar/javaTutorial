package ch02_DataTypes_WrapperClass;

public class C02_SwapInterviewQuestion {

    public static void main(String[] args) {

        //3. variable kullanilarak

        //1.adim
        int sayi1 = 20;
        int sayi2 = 34;
        int temp;

        System.out.println("swap isleminden once sayi1 = "+sayi1+ " sayi2 = " + sayi2);

        //2.adim
        temp = sayi1;

        //3.adim
        sayi1=sayi2;

        //4.adim
        sayi2 = temp;


        System.out.println("swap isleminden sonra sayi1 = "+sayi1+ " sayi2 = " + sayi2);

        // 3. variable kullanilmadan.

        System.out.println("swap isleminden once sayi1 = "+sayi1+ " sayi2 = " + sayi2);

        sayi1 = sayi2 + sayi1; //54
        sayi2 = sayi1 - sayi2; //20
        sayi1 = sayi1 - sayi2; //34


        System.out.println("swap isleminden sonra sayi1 = "+sayi1+ " sayi2 = " + sayi2);



    }
}
