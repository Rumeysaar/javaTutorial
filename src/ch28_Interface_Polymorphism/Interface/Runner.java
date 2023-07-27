package ch28_Interface_Polymorphism.Interface;

import static ch28_Interface_Polymorphism.Interface.C03_DisDonanim.RENK;

public class Runner {
    public static void main(String[] args) {

        C06_Passat passat = new C06_Passat();
        passat.ebat();
        passat.jant();
        passat.kapi();
        passat.kaparto();
        passat.klima();
        passat.koltuk();
        passat.motor();
        passat.yakit();
        passat.sislamp();
        passat.sunroof();

        System.out.println("C05_Lastik.RENK = " + C05_Lastik.RENK);
        System.out.println("RENK = " + RENK);

        System.out.println("C04_IcDonanim.KUMAS = " + C04_IcDonanim.KUMAS);

        //C04_IcDonanim.TAPE ="SADA";
        //Cannot assign a value to final variable 'TAPE'

       C04_IcDonanim passat1 = new C06_Passat();
        ((C06_Passat) passat1).motor();



    }
}
