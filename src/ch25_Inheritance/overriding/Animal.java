package ch25_Inheritance.overriding;

public class Animal {

    public Animal(){
        System.out.println("animal class pmsiz const");
    }
    public void yeme(){
        System.out.println("hayvan yer");
    }
    public void icme(){
        System.out.println("hayvan icer");
    }
    public void hareket(){
        System.out.println("hayvan hareket eder");
    }

    int number = 34;
    int age = 33;
    int numberOfAnimals = 500;

    @Override
    public String toString() {
        return "Animal{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfAnimals=" + numberOfAnimals +
                '}';
    }
}
