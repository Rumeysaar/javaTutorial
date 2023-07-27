package ch27_Abstraction.abstract01;

public abstract class Honda { //parent

    abstract void motor(); // abstract method

    protected void sunroof(){
        System.out.println("panaromik cam tavan harika seyir");
    }

    String name = "Fatih"; // abst classda variable tanimlanabilir
    // abstract String name2 = "fatih"; //Modifier 'abstract' not allowed here

    abstract void koltuk();
    abstract void kapi();


}
