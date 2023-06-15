package ch10_MethodCreation;

import java.util.Scanner;

public class C05_CRUD {

    static Scanner input = new Scanner(System.in);
    static String staticUserName ;
    public static void createUser(){
        System.out.println("enter user name");
        String userName = input.nextLine();

        staticUserName = userName;

        System.out.println("userName = " + userName + "\n" + "sisteme kayit edildi");
    }

    public static void getUser (){
        System.out.println("sorgulanmak istenen user name");
        String userName = input.nextLine();

        if (userName.equals(staticUserName))
            System.out.println("kuallanici sistemde mevcut");
        else System.out.println("kullanici bulunamadi");

    }

    public static void updateUser(){
        System.out.println("kullanici ismi" + staticUserName);
        System.out.println("yani kullanici ismi girin");

        String yeniIsim = input.nextLine();

        staticUserName = yeniIsim;

        System.out.println("kullanici ismi guncellendi");
        System.out.println("kullanici ismi =" + staticUserName);

    }
    public static void deleteUser(){
        System.out.println("silmek istenen kullanici ismi");
        String silinecekIsim = input.nextLine();
        if (silinecekIsim.equals(staticUserName)) {
            System.out.println(staticUserName + "isimli kullanici silindi");
            staticUserName = null;
        }
        else System.out.println(silinecekIsim + "isimli kullanici bulunamadi");

    }

    public static void cikis(){
        System.out.println("cikis yaptiniz");
    }

}
