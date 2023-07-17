package ch23_AccessModifier;

public class C01_AccessModifier {

    private int privateYas;
    int defaultYas;
    protected int protectedYas;
    public int publicYas;

    public C01_AccessModifier() {
        System.out.println("pmsiz constructor");
    }

    private C01_AccessModifier(int privateYas, int protectedYas) {
        System.out.println("access mod priv ve prot constan selam");
        privateMethod();
        this.privateYas = privateYas;
        this.protectedYas = protectedYas;
    }

    public C01_AccessModifier(int privateYas, int protectedYas, int publicYas) {
        this.privateYas = privateYas;
        this.protectedYas = protectedYas;
        this.publicYas = publicYas;
    }
    private void privateMethod(){
        System.out.println("private metod calisti");
    }
    protected void protectedMethod(){
        System.out.println("protected method calisti");
    }

    @Override
    public String toString() {
        return "C01_AccessModifier{" +
                "privateYas=" + privateYas +
                ", defaultYas=" + defaultYas +
                ", protectedYas=" + protectedYas +
                ", publicYas=" + publicYas +
                '}';
    }
    //C01_AccessModifier objPrivate = new C01_AccessModifier(25,55);

    public static void main(String[] args) {










    }
}
