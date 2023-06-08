package ch05_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {

        int yasMeryem = 35;
        int yasAhmet = 33;

        if (yasMeryem == yasAhmet) {
            System.out.println("ayni yastasiniz");
        }

        if (yasMeryem>40) {
            System.out.println("yas 40'dan buyuk");
        }

        if (yasMeryem + yasAhmet > 50)
            System.out.println("ikisinin yas 50'den buyuktur"); // bazen if {} olmadan da yazilabilir
        // if in scopu ilk ; e kadardir.








    }
}
