package ch32_Enum.enum03;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {


        Kitap kitap1 = new Kitap();
        kitap1.name = "Sefiller";
        kitap1.kategori = KitapKategori.KLASIK;

        Kitap kitap2 = new Kitap();
        kitap2.name = "Calikusu";
        kitap2.kategori = KitapKategori.ROMAN;

        Kitap kitap3 = new Kitap();
        kitap3.name = "Suc ve Ceza";
        kitap3.kategori = KitapKategori.TARIH;

        ArrayList<Kitap> kitaplist = new ArrayList<>();
        kitaplist.add(kitap1);
        kitaplist.add(kitap2);
        kitaplist.add(kitap3);

        for (Kitap each : kitaplist) {
            if (each.kategori.equals(KitapKategori.KLASIK)){
                System.out.println(each);
            }

        }






    }
}
