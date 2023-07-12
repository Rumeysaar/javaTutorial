package ch20_Constructor;

public class C01_Constructor {

        //fields
        String str ; // instance variable
        String selam = "hello world";

        //default constructor
       // public C01_Constructor(){
       //
       // }


    public static void main(String[] args) {

        //new C01_Constructor(); pm siz constructor call eder
        C01_Constructor obj1 = new C01_Constructor();
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();

        System.out.println("obj1 = " + obj1.str); // null
        System.out.println("obj1.selam = " + obj1.selam); //hello world

        obj1.str = "javAslan";
        obj2.str = "javAtar";
        System.out.println("obj3.selam = " + obj3.selam);
        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj2.str = " + obj2.str);
        System.out.println("obj4.str = " + obj4.str);

        obj2.metod();
        obj4.metod();


    }

    public void metod(){
        System.out.println("metoddan selam");
    }








}
