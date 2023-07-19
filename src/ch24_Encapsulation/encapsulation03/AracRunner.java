package ch24_Encapsulation.encapsulation03;

public class AracRunner {
    public static void main(String[] args) {
        Arac arac1 = new Arac("Tesla", "blue",
                900,-2023);

        Arac arac2 = new Arac("Tesla", "black",
                2000,-2015);


        Arac arac3 = new Arac();
        arac2.setMotorHacmi(800);
        arac3.setModel("Mercedes");
        arac3.setRenk("red");
        arac3.setMotorHacmi(800);
        arac3.setYil(1923);

        System.out.println(arac1);
        System.out.println(arac2);
        System.out.println(arac3);






    }
}
