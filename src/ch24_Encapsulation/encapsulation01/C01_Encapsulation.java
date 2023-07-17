package ch24_Encapsulation.encapsulation01;

public class C01_Encapsulation {
    public static void main(String[] args) {

        C02_Encapsulation obj1 = new C02_Encapsulation();
        System.out.println("obj1.getId() = " + obj1.getId());
        System.out.println("obj1.getName() = " + obj1.getName());

        C02_Encapsulation obj2 = new C02_Encapsulation(1001, "Rumeysa");
        System.out.println("obj2.getId() = " + obj2.getId());
        System.out.println("obj2.getName() = " + obj2.getName());

        obj1.setName("Safak hanim");
        System.out.println("obj1.getName() = " + obj1.getName());

        obj2.setName("furkan bey");
        System.out.println("obj2.getName() = " + obj2.getName());
    }
}