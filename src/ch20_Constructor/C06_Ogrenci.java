package ch20_Constructor;

public class C06_Ogrenci {


    String isim = "Zeynep";
    int yas ;
    String name ;
    int age ;

    public C06_Ogrenci(String isim, int yas) {
        //this.isim = isim;
        //this.yas = yas;

        isim = isim;
        yas = yas;

        name =isim;
        age = yas;

        System.out.println("pojo icinden isim = " + isim);
        System.out.println("pojo icinden this.isim = " + this.isim);
        System.out.println("pojo icinden name = " + name);
    }

    public C06_Ogrenci() {
    }
}
