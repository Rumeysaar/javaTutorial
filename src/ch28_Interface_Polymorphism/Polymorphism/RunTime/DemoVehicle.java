package ch28_Interface_Polymorphism.Polymorphism.RunTime;

public class DemoVehicle {
    public static void main(String[] args) {

        /*
        *Runtime Polymorphism (Dynamic Poly.)
        * Method Overriding
         */

        Vehicle vehicle1 = new Vehicle();

        Vehicle vehicle2 = new SportCar();

        Vehicle vehicle3 = new Truck();

        vehicle1.speedUpTo60mph();
        vehicle2.speedUpTo60mph();
        vehicle3.speedUpTo60mph();



    }
}
