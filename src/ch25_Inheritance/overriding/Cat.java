package ch25_Inheritance.overriding;

public class Cat extends Pet {
    public Cat (){

        System.out.println("kediler psikolojiye iyi gelir");
    }
    public void mirmir(){
        System.out.println("kediler mirmirla moralinizi duzeltir");
    }

    public Cat(String str){
        this();
    System.out.println(super.number);
    System.out.println(this.number);
    System.out.println("kediler psikolojiye iyi gelir");

    }

    @Override
    public void icme() {
        System.out.println("cate gore override edilmis icme metodu ");
    }

    int number = 22;
    int age = 11;
    int numberOfCats = 50;

    @Override
    public String toString() {
        return "Cat{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfCats=" + numberOfCats +
               super.toString() +
                '}';
    }
}

