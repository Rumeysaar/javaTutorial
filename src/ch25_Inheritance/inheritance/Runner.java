package ch25_Inheritance.inheritance;

public class Runner {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.yeme();
        animal1.icme();
        animal1.hareket();

        Pet pet1 = new Pet();
        pet1.beslenme();
        pet1.hareket();


        Fish hamsi = new Fish();
        hamsi.izgaraBalik();
        hamsi.yeme();

        Dog dog1 = new Dog();
        dog1.dogMethod();
        dog1.beslenme();
        dog1.icme();

        dog1.icme();




    }
}
