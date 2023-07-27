package ch27_Abstraction.abstract_polymorphism01;

public abstract class AbstractClass { // parent class
    public static void byLinkText(){ //concrete method
        System.out.println("link text super");
    }
    public void get(){ //concrete method
        System.out.println("chrome");
    }

    abstract void absMethod();
}

class Test extends AbstractClass{
    public static void byLinkText(){ //concrete method
        System.out.println("link text sub class");
    }
    public void get(){ //concrete method
        System.out.println("firefox");
    }

    @Override
    void absMethod() {
        System.out.println("abs method override edildi");
    }
    public static void test(){
        System.out.println("test method");
    }

    public static void main(String[] args) {
        Test.byLinkText();
        AbstractClass.byLinkText();

       // AbstractClass obj = new AbstractClass();
        //'AbstractClass' is abstract; cannot be instantiated

        AbstractClass obj = new Test();
        obj.absMethod();
        obj.get();
    }
}
