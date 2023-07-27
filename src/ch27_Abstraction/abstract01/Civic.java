package ch27_Abstraction.abstract01;

public class Civic extends Lastik {

    @Override
    void motor() {
        System.out.println("civic icin ideal motor 1.6");
    }

    @Override
    void koltuk() {
        System.out.println("kadife kumas");
    }

    @Override
    void kapi() {
        System.out.println("4 kapi uzun kasa");
    }

    @Override
    public void lastikEbat() {
        System.out.println("lastikler 18 inc");
    }

    public int vites(){
        return 6;
    }
}
