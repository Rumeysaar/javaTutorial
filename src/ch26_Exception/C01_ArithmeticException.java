package ch26_Exception;

import java.util.Scanner;

public class C01_ArithmeticException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayi gir");
        int sayi = input.nextInt();
        System.out.println("2. sayi gir");
        int sayi2 = input.nextInt();

        // RTE int sonuc = sayi/sayi2;

        System.out.println("calismaya devam ediyor");

        try { // kodu derleyen blok
            int sonuc = sayi/sayi2;
            System.out.println(sonuc);
            System.out.println("try blok icerisi");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException sayi 0 a bolunmez");
            System.out.println("e.getMessage() = " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException sayi 0 a bolunmez");

        }catch (Exception e){
            System.out.println("exception varsa yukaridakiler disinda burasi calisir");
        }
        finally {
            System.out.println("finally blok her zaman calisir");
        }

        System.out.println("classin son kodu");

    }

}
