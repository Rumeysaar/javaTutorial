package ch27_Abstraction.abstract02;

public abstract class Sekil {

    private String name;

    public Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla();
    public abstract double cevreHesapla();

    public String ciz(){
        return name + " isimli sekliniz ciziliyor";
    }
    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' + "\nsekil alani = "
                + alanHesapla() + "\nsekil cevresi = " +
                cevreHesapla() + "\ncizilecek sekil = " + this.ciz() +
                '}';
    }
}
