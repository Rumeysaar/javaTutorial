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

    //CTE
    //protected void hareket() {
    //    super.hareket();
    //}

    @Override
    public void icme() {
        System.out.println("pet classdan overrodong icme metodu");
    }
    private void privateMethod(){
        System.out.println("pet classin private metodu");
    }//miras alinamaz

    int number = 104;
    int age = 101;
    int numberOfPets = 201;

    @Override
    public String toString() {
        return "Pet{" +
                "number=" + number +
                ", age=" + age +
                ", numberOfPets=" + numberOfPets +
                '}';
    }
}

