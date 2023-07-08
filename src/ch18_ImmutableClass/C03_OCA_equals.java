package ch18_ImmutableClass;

public class C03_OCA_equals {
    public static void main(String[] args) {
        String a = "";
        String c = "2cfalse";
        a+=2;
        a+='c';
        a+=false;

        System.out.println("a = " + a);
        String b = "2cfalse";
        System.out.println("b = " + b);
        if (a==b){ // calismaz referans degerleri farkli String values are compared using '==', not 'equals()'
            System.out.println("a==b");
        }

        if (a == "2cfalse") {
            // calismaz
        }

        if (c == b) {
            System.out.println("c==b calisir ");
        }

        if (a.equals("2cfalse")){
            System.out.println("a equals 2 cfalse");
        }

    }
}
