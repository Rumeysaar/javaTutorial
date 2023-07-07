package ch11_Debugger;

public class C03_Debugger {
    static int count = 7;
    public static void main(String[] args) {

        method01();








    }

    private static void method01() {
        System.out.println(" ** method01 calisiyor ** ");
        int a = 0;
        count ++;

        for (int i = 0; i <= 10; i++){
            System.out.print( i + " ");
            a+=2*i;
        }
        System.out.println();
        System.out.println(" ** method 02 call ediliyor ** ");
        method02();
        System.out.println(" ** method 02 call ediliyor ** ");
        method03();
    }

    private static void method03() {
        System.out.println(" ** method 02 calisiyor ** ");
        count += 53;
        for (int x = 1; x < 5; x++){
            System.out.println(x + " ");
        }
        System.out.println();
        System.out.println("method 03 sonu");
    }

    private static void method02() {
        System.out.println(" ** method 02 calisiyor ** ");
        count += 5;
         for (int x = 1; x < 7; x++){
             System.out.println(x + " ");
         }
        System.out.println();
        System.out.println("method 02 sonu");
    }
}
