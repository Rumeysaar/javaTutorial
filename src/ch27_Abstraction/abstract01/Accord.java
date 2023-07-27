package ch27_Abstraction.abstract01;

public class Accord extends Honda{ //Class 'Accord' must either be declared abstract or
    // implement abstract method 'motor()' in 'Honda'
    //normal (concrete) bir classtan abstract class extend edilirse ya class abstract yapilmali ya da
    // abstract classdaki metodlar override edilmeli

    @Override
    void motor() {

    }

    @Override
    void koltuk() {

    }

    @Override
    void kapi() {

    }
}
