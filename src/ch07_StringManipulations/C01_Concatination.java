package ch07_StringManipulations;

public class C01_Concatination {
    public static void main(String[] args) {

        String name = "Batu";
        String title = "SDET QA";
        int age = 30;

        System.out.println(name + title);
        System.out.println("name.concat(title) = " + name.concat(title));

        System.out.println("age = " + age);

        String num = "12345";
        System.out.println("num+1 = " + num+1);
        System.out.println("Integer.valueOf(num+1) = " + (Integer.valueOf(num + 1) + 1));

        System.out.println("name.concat(100 + \" :) \") = " + name.concat(true + " :) "));
        System.out.println("name.concat(100 + \" :) \") = " + name.concat(100 + " :) "));


    }
}
