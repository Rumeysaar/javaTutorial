package ch32_Enum.enum01;

import ch27_Abstraction.abstract02.Main;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        Aylar ay = Aylar.AGUSTOS;
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());

        System.out.println("ay.hashCode() = " + ay.hashCode());

        System.out.println("ay.ordinal() = " + ay.ordinal());
        switch (ay){
            case OCAK:
                System.out.println("31 gun icerir");
                break;
            case SUBAT:
                System.out.println("28 gundur");
                break;
            case MART:
                System.out.println("31 gundur");
                break;
            case AGUSTOS:
                System.out.println("agustos 31 gundur");
                break;
            default:
                System.out.println("hatali giris");
                break;
        }


    }
}
