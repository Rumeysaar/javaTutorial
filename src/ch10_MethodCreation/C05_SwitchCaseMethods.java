package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.updateUser;

public class C05_SwitchCaseMethods {

    public static void menu(){
        System.out.println("ana sayfa");
        System.out.println("kayit olmak icin 1 \n kullanici sorgulamak icin 2 \n" +
                " kullanici ismi guncellemek icin 3 \n kullanici silmek icin 4 \n cikis icin 5'e basiniz ");

        Scanner in = new Scanner(System.in);
        int secim = in.nextInt();

        switch (secim){
            case 1 :
               C05_CRUD.createUser();
                menu();
                break;
            case 2 :
                C05_CRUD.getUser();
                menu();
                break;
            case 3 :
                updateUser();
                menu();
                break;
            case 4 :
                C05_CRUD.deleteUser();
                menu();
                break;
            case 5 :
                C05_CRUD.cikis();
                break;
            default:
                System.out.println("hatali tuslama");
                menu();
                break;
        }




    }

}
