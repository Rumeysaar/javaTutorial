package ch07_StringManipulations;

public class C11_valueOf_parseInt {
    public static void main(String[] args) {

        String str1 = "123  ".trim();
        String str2 = "134  ".trim();
        String str3 = "123 344".replaceAll(" ", "" );

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2) + Integer.valueOf(str3));


    }
}
