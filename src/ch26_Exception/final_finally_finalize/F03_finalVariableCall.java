package ch26_Exception.final_finally_finalize;

public class F03_finalVariableCall {
    public static void main(String[] args) {

        System.out.println("F03_finalVariable.SAYI = " + F03_finalVariable.SAYI);

       // F03_finalVariable.SAYI ++
        // cannot assign a value to a final variable
       // final variable basta initialize edilir sonrasinda degistirilemez

    }
}
