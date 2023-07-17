package ch23_AccessModifier.newPackage;

import ch23_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {

    private String privateNAme = "Meryem Hanim";
    String defaultName = "zeynep hanim";
    public String publicName ="Ali bey";
    protected String protectedName = "Hasanbey";

    public static void main(String[] args) {


        C01_AccessModifier obj1 = new C01_AccessModifier();

        System.out.println("obj1.publicYas = " + obj1.publicYas);



    }




}
