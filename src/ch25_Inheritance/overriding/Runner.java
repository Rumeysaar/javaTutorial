package ch25_Inheritance.overriding;

import ch25_Inheritance.inheritance.Dog;
import ch25_Inheritance.inheritance.Fish;

public class Runner {
    public static void main(String[] args) {

      Cat cat1 = new Cat("cat");
      Cat cat2 = new Cat();
        System.out.println("cat2.number = " + cat2.number);

        Pet pet1 = new Pet();
        System.out.println("pet1.number = " + pet1.number);
        System.out.println("pet1.numberOfAnimals = " + pet1.numberOfAnimals);

        pet1.icme();
        pet1.beslenme();
        pet1.hareket();

        System.out.println("pet1 = " + pet1);




    }
}
