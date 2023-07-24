package ch24_Encapsulation.encapsulation03;

public class Arac {
    private String model;
    private String renk;
    private int motorHacmi;
    private int yil;

    public Arac(String model, String renk, int motorHacmi, int yil) {
        this.model = model;
        this.renk = renk;
       setMotorHacmi(motorHacmi);
        setYil(yil);
    }

    public Arac() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        if (motorHacmi < 1000) {
            System.out.println("motor kucuk");
            this.motorHacmi = 1001;
        }else this.motorHacmi = motorHacmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil < 0){
        this.yil = yil;
            System.out.println("- yil girdiniz");
            this.yil = (-1)*yil;
        }else if (yil >2025){
            System.out.println("gecerli bir yil giriniz");
        }else
            this.yil = yil;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", yil=" + yil +
                '}';
    }
}
