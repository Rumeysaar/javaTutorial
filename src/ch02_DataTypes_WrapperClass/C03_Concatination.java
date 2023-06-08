package ch02_DataTypes_WrapperClass;

public class C03_Concatination {

    public static void main(String[] args) {



        char ch = 'A';
        char ch2 = 'C';

        System.out.println(ch + ch2);  // (132) ascii degerlerini bulup toplar

        System.out.println('A' + 'C');  // 132

        System.out.println("A" + "B");  // AB

        String name = "Zeynep Hanim";
        String lastName = "Fitnat";
        int a = 7;
        int b = 11;

        System.out.println(name + lastName + a+b); // Zeynep HanimFitnat711

        System.out.println(a+ name + lastName + b); // 7Zeynep HanimFitnat11

        System.out.println(a+b + name + lastName); //18Zeynep HanimFitnat  / baslangic degerler int oldugu icin toplar
        // string gordukten sonrakileri concat eder.

        System.out.println(name + lastName + (a+b)); // Zeynep HanimFitnat18 / a+b parantez icinde oldugu icin islem onceligi

        System.out.println(name+ (a-b) + (a-b));  //Zeynep Hanim-4-4

        System.out.println(name + ( ( (a-b) + (a-b) ) ) );  //Zeynep Hanim-8

        char num = '1';
        System.out.println(name + num);  //Zeynep Hanim1

        System.out.println(a+num + name);  //56Zeynep Hanim

        System.out.println(name + (num + b)); //Zeynep Hanim60

        System.out.println(a + name + num ); //7Zeynep Hanim1







    }
}
