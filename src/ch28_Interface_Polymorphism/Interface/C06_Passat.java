package ch28_Interface_Polymorphism.Interface;

public class C06_Passat extends C02_VolksWagen implements C03_DisDonanim,C04_IcDonanim,C05_Lastik{


    @Override
    public void motor() {
        System.out.println("2.0 motor");
    }

    @Override
    public void yakit() {
        System.out.println("benzinli");
    }

    @Override
    public void kapi() {
        System.out.println("4 kapili");
    }

    @Override
    public void kaparto() {
        System.out.println("boyasiz degisensiz kursunlu");
    }

    @Override
    public void koltuk() {
        System.out.println("deri koltuk");
    }

    @Override
    public void klima() {
        System.out.println("klimasi var");
    }

    @Override
    public void ebat() {
        System.out.println("18 inc ebat derin");
    }

    @Override
    public void jant() {
        System.out.println("celik");
    }
}
