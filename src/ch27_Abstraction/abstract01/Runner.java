package ch27_Abstraction.abstract01;

public class Runner {
    public static void main(String[] args) {

        Civic cvc1 = new Civic();
        System.out.println("cvc1.name = " + cvc1.name);

        System.out.println("cvc1.vites() = " + cvc1.vites());
        cvc1.kapi();
        cvc1.koltuk();

        // abstract classdan obje create edilir mi ? genel olarak hayir

        cvc1.lastikEbat();
        cvc1.motor();



    }
}
