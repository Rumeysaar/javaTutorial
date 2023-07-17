package ch24_Encapsulation.encapsulation01;

public class C02_Encapsulation {

    /* POJO class create ederken yapilacaklar:
    1- fieldslarin yazilmasi ve encapsule edilmesi
    2- constructorlarin create edilmesi
    3- to string methodunun create edilmesi
    4- getter ve setterlarin create edilmesi
     */

    private int id;
    private String name;

    public C02_Encapsulation() {
    }

    public C02_Encapsulation(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

   //public void setId(int id) {
   //    this.id = id;
   //}   id gibi bilgiler herkes icin degisecegi icin set edilmez

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("name = " + name);
    }

    @Override
    public String toString() {
        return "C02_Encapsulation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
