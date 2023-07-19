package ch24_Encapsulation.encapsulation04;

import java.util.Scanner;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public double getBMI(){
        double bmi = weight/(height*height);
        return bmi;
    }
    public String getStatus(){
        if (getBMI()< 18.5){
            return "zayifsin";
        } else if (getBMI() < 25){
            return "normal";
        } else if (getBMI() < 30) {
            return "normal";
        }else
            return "obez";
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

class Runner{
    public static void main(String[] args) {
        BMI obj1 = new BMI("ahmet", 34,84.6,1.84);
        System.out.println(obj1);
        System.out.println("isminiz = " + obj1.getName() + "\ndurum = " + obj1.getStatus() + "\nbmi = " + obj1.getBMI());

        Scanner input = new Scanner(System.in);
       // BMI kisi = new BMI();
        System.out.println("isminiz");
        //kisi.setName(input.nextLine());
        String name = input.nextLine();

        System.out.println("yasiniz");
        //kisi.setAge(input.nextInt());
        int age = input.nextInt();

        System.out.println("kilonuz");
       // kisi.setWeight(input.nextDouble());
        double weight = input.nextDouble();

        System.out.println("boyunuz");
       // kisi.setHeight(input.nextDouble());
        double height = input.nextDouble();

        BMI kisi2 = new BMI(name,age,weight,height);
        System.out.println("kisi2 = " + kisi2);

        System.out.println("kisi2.getStatus() = " + kisi2.getStatus());
        System.out.println("kisi2.getBMI() = " + kisi2.getBMI());


    }

}
