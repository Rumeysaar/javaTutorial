package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> listNotlar = new ArrayList<>();

        String devamMi;
        do {
            System.out.println("not giriniz");
            int ogrnNot = input.nextInt();
            System.out.println("not girmye devam etmek icin (E); bitirmek icin (H) secin");
            devamMi = input.next();
            listNotlar.add(ogrnNot);

        }while (devamMi.equalsIgnoreCase("E"));

        Collections.sort(listNotlar);
        System.out.println("listNotlar = " + listNotlar);


        int notToplam = 0;
        for (int w:listNotlar) {
            notToplam += w;
        }

        double ortalama = notToplam/listNotlar.size();

        System.out.println("ortalama = " + ortalama);

        int ortalamaGecenler = 0;
        for (int each : listNotlar) {
            if (each > ortalama)
                ortalamaGecenler ++;
            System.out.print("not = " + each + " ");
        }

        System.out.println();
        System.out.println("ortalamaGecenler = " + ortalamaGecenler);











    }}
