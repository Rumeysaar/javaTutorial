package ch24_Encapsulation.encapsulation02;

public class UserRunner {
    public static void main(String[] args) {


        User obj = new User("ali","akar","1234a",24);

        System.out.println("obj = " + obj);

        System.out.println("obj.getAd() = " + obj.getAd());
        System.out.println("obj.getSoyad() = " + obj.getSoyad());
        System.out.println("obj.getPassword() = " + obj.getPassword());
        System.out.println("obj.getYas() = " + obj.getYas());

        User user2 = new User("Zeynep", "Aytop", "z1234",-34);
        System.out.println("user2 = " + user2);


    }

}
