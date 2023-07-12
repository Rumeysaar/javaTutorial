package ch20_Constructor;

public class C04_Teacher {


//fields

    int id;
    String ad;
    String soyad;
    String brans;
    int tecrube;
    double maas;
    boolean emekliMi;

    public C04_Teacher() {
    }

    public C04_Teacher(String ad, String soyad, String brans) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
    }
    public void dersSaati (){
        System.out.println("15 saati asae");
    }

    public C04_Teacher(int id, String ad, String soyad, String brans, int tecrube, double maas, boolean emekliMi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekliMi = emekliMi;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekliMi=" + emekliMi +
                '}';
    }
}