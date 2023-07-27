package ch26_Exception.final_finally_finalize;

public class F03_finalVariable {
    public static final int SAYI = 34;

    public static void main(String[] args) {
        final int SAYI2 = 35;

       // SAYI2++; //Cannot assign a value to final variable 'SAYI2'
       // SAYI++; //Cannot assign a value to final variable 'SAYI'


    }
}
