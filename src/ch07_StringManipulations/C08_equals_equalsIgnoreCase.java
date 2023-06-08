package ch07_StringManipulations;

public class C08_equals_equalsIgnoreCase {
    public static void main(String[] args) {

        String str = "Merhaba";
        String str1 = "merhaba";

        System.out.println("str before replace= " + str);
        System.out.println("str.replace(\"\\\\w\" , \"*\") = " + str.replaceAll("\\w", "*"));

        System.out.println("str before replace= " + str);

        System.out.println("str.equals(str1) = " + str.equals(str1));
        System.out.println("str1.equals(str) = " + str1.equals(str));
        System.out.println("str.equalsIgnoreCase(str1) = " + str.equalsIgnoreCase(str1));

        str1 = "Merhaba";
        System.out.println("str.equals(str1) = " + str.equals(str1));
    }
}
