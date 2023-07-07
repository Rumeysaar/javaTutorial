package ch15_Varargs;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        /* Task ->
       verilen Stringleri birlestiren concat isimli METHOD create ediniz.

       input : "m", "e", "r", "v", "e";
       output : merve

       input : "a", "l", "i";
       output : ali

        */

        String [] letters = {  "m", "e", "r", "v", "e"};
        String [] letters2 = {  "a", "l", "i"};
        String [] letters3 = {  "ali", "leyla", "irem"};

        concat(letters3);






    }

    private static void concat(String... arr) {
        for (String w : arr) {
            System.out.print(w);
        }
    }
  //private static void concat(String... arr) {
  //    String ss = "";
  //    for (String w : arr) {
  //        ss += w;
  //    }
  //    System.out.println(ss);
  //}
}
