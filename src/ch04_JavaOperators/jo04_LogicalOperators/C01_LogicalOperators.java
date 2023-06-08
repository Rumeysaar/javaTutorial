package ch04_JavaOperators.jo04_LogicalOperators;

public class C01_LogicalOperators {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        int a = 3;
        int b = 5;

        System.out.println("b1 & (a<b) = " + (b1 & (a < b)));

        System.out.println("b2 & (a<b) = " + (b2 && (a < b)));

        System.out.println("b2  || (a<b) = " + (b2 || (a < b)));

        System.out.println("!b1 || (a>b) = " + (!b1 || (a > b)));

    }
}
