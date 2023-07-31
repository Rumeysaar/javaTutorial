package ch28_Interface_Polymorphism.Polymorphism;

class Animal{
    public void talk(){
        System.out.println("animal is talking");
    }
}
class Tiger extends Animal{
    public void hunt(){
        System.out.println("tiger is hunting");
    }
    public void talk(){
        System.out.println("tiger is talking ==> roar");
    }
}
class Octopus extends Animal{
    public void swim(){
        System.out.println("octopus is swimming");
    }
    public void talk(){
        System.out.println("octopus is talking ==> glukgluk");
    }
}


public class Zoo {
    public static void main(String[] args) {

        Tiger tiger1 = new Tiger();
        Tiger[] tigers = {tiger1, new Tiger()};

        Octopus octopus1 = new Octopus();
        Octopus [] octopuses = {octopus1, new Octopus()};

             Animal          animal1 =         new Tiger();
        //reference type   reference name    obj. constructor

        animal1.talk();// tigerdaki metodu alir
       // animal1.hunt // Cannot resolve symbol 'hunt'
        //parentta olmayan bir metoda parent olan bir data type ile erisemeyiz
        // ilk data type bak override edilmişse child 'a git, yoksa static ise childa gitmez

        Animal animal2 = new Octopus();
        // animal2.swim() // Cannot resolve method 'swim' in 'Animal'
        animal2.talk();

    }

}
