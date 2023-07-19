package ch24_Encapsulation.encapsulation05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("isminiz");
        String name = input.nextLine();

        System.out.println("yasiniz");
        int age = input.nextInt();

        Student sdt = new Student(name,age);
        System.out.println("sdt = " + sdt);
    }



}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student name is " + name + '\n' +
                "S/he is " + age +
                "years old";
    }
}