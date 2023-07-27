package ch26_Exception.salaryCcalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        Employee employee = new Employee("Iclal", 125000, 60, 2020);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("tax " + employee.tax());
        System.out.println("bonus " + employee.bonus());
        System.out.println("raise salary "+ employee.raiseSalary());

        System.out.println(employee);

        salaryCalculate();



    }

    private static void salaryCalculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("isminiz");
        String name = input.nextLine().trim();

        System.out.println("maasiniz");
        int salary = 0;
        try {
            salary = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz");
            salaryCalculate();
        }
        System.out.println("calisma saati");
        int workHours = 0;
        try {
           workHours = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz");
            salaryCalculate();
        }
        System.out.println("ise baslama yiliniz");
        int year = 0;
        try {
            year = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("hatali giris yaptiniz");
            salaryCalculate();
        }

        Employee employee = new Employee(name,salary,workHours,year);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("tax " + employee.tax());
        System.out.println("bonus " + employee.bonus());
        System.out.println("raise salary "+ employee.raiseSalary());

        System.out.println("employee = " + employee);
    }
}