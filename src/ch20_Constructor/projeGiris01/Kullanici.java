package ch20_Constructor.projeGiris01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Kullanici {
    String name ;
    LocalDateTime kayitZamani ;

    public Kullanici(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
    public Kullanici(){

    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "name='" + name + '\'' +
                ", kayitZamani=" + kayitZamani +
                '}';
    }
}
