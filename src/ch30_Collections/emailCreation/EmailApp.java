package ch30_Collections.emailCreation;

import java.util.Scanner;

public class EmailApp {
    private String name;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String emailSuffix = "clarusway.com";
    private int passwordLenght = 12;

    public EmailApp() {
    }

    public EmailApp(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.password = setRandomPassword(passwordLenght);
        System.out.println("password = " + password);
        this.department = setDepartment();
        this.email = name.toLowerCase() + lastName.toLowerCase() + "." + department + "@" + emailSuffix;
    }

    public EmailApp(String name, String lastName, String password, String department, String email, String emailSuffix, int passwordLenght) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.emailSuffix = emailSuffix;
        this.passwordLenght = passwordLenght;
    }

    public String setRandomPassword(int passwordLenght) {
        String dataSource = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:'\",.<>?";

        char[] password = new char[passwordLenght];

        for (int i = 0; i < passwordLenght; i++) {
            int random = (int) (Math.random() * dataSource.length());
            password[i] = dataSource.charAt(random);
        }
        return new String(password);
    }

    @Override
    public String toString() {
        return "EmailApp{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", emailSuffix='" + emailSuffix + '\'' +
                ", passwordLenght=" + passwordLenght +
                '}';
    }

    public String setDepartment() {
        System.out.println("bu departmentlerden birini sec\n" +
                "1 - Test Automation\n" +
                "2 - Developer\n" +
                "3 - DevOps");
        Scanner input = new Scanner(System.in);
        int secim = input.nextInt();

        if (secim == 1) {
            return "Test Automation";
        } else if (secim == 2) {
            return "Developer";
        } else if (secim == 3) {
            return "DevOps";
        } else
            return "hatali giris";


    }
}

