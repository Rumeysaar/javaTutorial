package ch10_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        System.out.println("beginning of method creation");

        topla();

        System.out.println(topla2(55, 72));



    }

    public static int topla2(int sayi1 , int sayi2) { //Task >> iki tane int deger alan toplayip return eden method create ediniz .
        int toplam = sayi1 + sayi2;

        return toplam;

    }

    private static void topla() {
        System.out.println("ilk create ettigimiz method");
        int a = 55;
        int b = 44;
        System.out.println(a+b);
        System.out.println("topla methodu calisti");

    }
}
