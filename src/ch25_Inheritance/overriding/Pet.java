package ch25_Inheritance.overriding;

public class Pet extends Animal {
    public Pet() {
        System.out.println("pet den selamlar petshop her turlu hayvaniniz bakim yapilir");
    }
    public void beslenme(){
        System.out.println("mama ile besleyin kuru ekmek vermeyin ");
    }
    public void uyuma(){
        System.out.println("uygun ortamlarda uyutun");
    }
}
