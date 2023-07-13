package ch20_Constructor.projeGiris01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KayitMethodlari {
    //step 2
    static ArrayList<Kullanici> kullaniciList = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    public ArrayList<Kullanici> kayitAl(){
        //kullanici classindan obje uretecek
        //kullanicidan aldigi ismi arrayliste ekleyecek
        System.out.println("isminizi giriniz");
        String isim = input.nextLine();

        Kullanici kullanici = new Kullanici(isim,LocalDateTime.now());
        //kullanicidan aldigimiz isim 1.pm olarak constructora verdik
        //2.parametre olarak LocalDateTime.now() verdik
        kullaniciList.add(kullanici);

        return kullaniciList;
    }
    //step 3
    public void sansliKullanici (ArrayList<Kullanici> list){
        //her dknin ilk 10 snsi kaydolanlari bulacak

        for (Kullanici each : list) {
            if (each.kayitZamani.getSecond()<=10){
                System.out.println(each.name + "lucky you");
            }else
                System.out.println("maybe later");
        }
    }

    public void Listele(){
        System.out.println(kullaniciList);
    }
    public void cikis (){
        System.out.println("gule gule");
    }


}
