package ch26_Exception;

import java.util.Scanner;

public class C07_IllegalArgumentException01 {
     /*

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */

    // IllegalArgumentException -> kullanılmasını istenmeyen değerlerde program hata vermemesi isteniyorsa bu excp
// fırlatılıer
// ornek : yas datası için negatif değer girilidğinde program kırılmadan run olması ama girilen değer için excp
// fırlatması için kullanılır..

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("yasiniz");

        int yas = input.nextInt();

      // if (yas < 18){
      //     System.out.println("yasiniz" + yas + "giris yapamazsiniz");
      //     throw new IllegalArgumentException();
      // }else System.out.println("mekanin sahibi geldi");

        try {
            if (yas < 18) {
                System.out.println("yasiniz " + yas + " giris yapamazsiniz");
                throw new IllegalArgumentException();
                //hata new leyerek, cathc blogunu da çalıştırmış olduk
                //throw bizi catche kanalize etti
            } else System.out.println("mekanin sahibi geldi");
        }catch (IllegalArgumentException e){
            System.out.println("yasin giris icin yetersiz" + e.getMessage());
        }

        System.out.println("kod devam");




    }
}
