package ch07_StringManipulations;

public class C02_lenght {
    public static void main(String[] args) {

        String str = "clarusway ile java";
        System.out.println(str.length());

       int lenghtOfStr = str.length();

        System.out.println("lenghtOfStr = " + lenghtOfStr);
        
        String str1 = "";
        System.out.println("str1.length() = " + str1.length());
        String str2 = " ";
        System.out.println("str2.length() = " + str2.length());
       //String str3 = null;
       //System.out.println(str3.length());

       //System.out.println("str3.concat(str2) = " + str3.concat(str2));

        String str4 = "null";
        System.out.println("str4 = " + str4.length());

        String str5 = "sfsdf";
        System.out.println("str4.concat(str5) = " + str4.concat(str5));

    }
}
