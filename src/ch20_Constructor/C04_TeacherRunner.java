package ch20_Constructor;

public class C04_TeacherRunner {


    public static void main(String[] args) {

        C04_Teacher tch = new C04_Teacher("Ayse", "Kilic","muzik");
        System.out.println(tch);

        C04_Teacher ogretmen = new C04_Teacher();

        ogretmen.ad= "zeynep";
        ogretmen.soyad= "Aytop";
        ogretmen.brans = "kimya";
        ogretmen.id = 123654;
        ogretmen.emekliMi= false;
        ogretmen.maas = 15000;
        ogretmen.tecrube= 15;

        System.out.println(ogretmen);






    }
}