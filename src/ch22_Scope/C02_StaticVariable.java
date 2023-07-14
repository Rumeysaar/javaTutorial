package ch22_Scope;

public class C02_StaticVariable {

    static String firmaName;
    static int firmaId;
    static boolean yerliMi;

    public static void main(String[] args) {
        System.out.println("firmaId = " + firmaId);
        firmaId = 1001;
        System.out.println("firmaId = " + firmaId);

        C02_StaticVariable.firmaName = "zararina satialar";
        yerliMi = false;
        staticMethod();

        C02_StaticVariable obj = new C02_StaticVariable();
        obj.nonStaticMethod();

        System.out.println("firmaName = " + firmaName);
        System.out.println("firmaId = " + firmaId);


    }
    public void nonStaticMethod(){
        System.out.println("static olmayan method calisti");
        firmaName = "nefes";
        firmaId = 3003;
    }


    public static void staticMethod() {
        System.out.println("static olan method calisti");
        firmaName = "continental";
        firmaId = 2002;
    }







}
