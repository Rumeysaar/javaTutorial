package ch28_Interface_Polymorphism.Polymorphism.RunTime;

public class SportCar extends Vehicle{

    @Override
    void speedUpTo60mph() {
        System.out.println("Sport car is speeding up to 60 in 3.2 sec.");
    }
}
