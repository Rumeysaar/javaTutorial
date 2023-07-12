package ch20_Constructor;

public class C03_Student {
    // POJO class = Plain Old Java Object ( reel adi entity class)
    //main method olmayan obje create etmek icin tasarlanmis class
    // objler icin depo, kaliphane, sablon, fabrika ...

    //fileds  -> inst variables
    String name;
    String lastName;
    int classNo;
    double degree;
    int schoolNo;
    boolean success;

    public void graduate (){ //meezun olup olmadigina bakan metod
        if (degree >= 60){
            System.out.println("graduated");
        }else
            System.out.println("waiting for next year");

    }

    public void socialActivity(){
        System.out.println("you should join social activities");
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classNo=" + classNo +
                ", degree=" + degree +
                ", schoolNo=" + schoolNo +
                ", success=" + success +
                '}';
    }
}
