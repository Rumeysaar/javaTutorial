package ch21_StaticKeyword;

public class C02_StaticBlock {
    static String isim = "safak hanim";

    static {
        System.out.println("static block calisti");
    }

    public static void main(String[] args) {
        System.out.println("main metod basladi");
        isim = "ali bey";
        System.out.println("isim = " + isim);



    }
}
