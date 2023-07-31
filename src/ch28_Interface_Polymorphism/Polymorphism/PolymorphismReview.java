package ch28_Interface_Polymorphism.Polymorphism;

class A{
    public void methodA(){
        System.out.println("method A from class A");
    }
    public static void methodC(){
        System.out.println("method C from class A");
    }
}
class B extends A{
    public void methodA(){
        System.out.println("method A from class B");
    }
    public void methodB(){
        System.out.println("method B from class B");
    }
    public static void methodC(){
        System.out.println("method C from class B");
    }
}
interface E{

}
abstract class C{

}
abstract class F implements E{

}
class D extends C implements E{

}
public class PolymorphismReview {
    public static void main(String[] args) {

        A obj = new B();
        obj.methodA();//method A from B class
        obj.methodC();//method C from A class
        //Static member 'ch28_Interface_Polymorphism.Polymorphism.A.methodC()' accessed via instance reference
        //method static oldugu icin obje ile cagrildiginda parenttan gelir childde override olsa bile

        B.methodC();
        // B classdan method C yi call eder.

       //B obj1 = new A(); // child class dan parenta obj olusturulmaz
        B obj1 = (B) new A(); // hatali casting, calismaz

        C obj2 = new D();
        E obj3 = new D();
       // D obj4 = new E(); //'E' is abstract; cannot be instantiated


    }
}
