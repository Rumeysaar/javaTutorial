package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class C14_ListConvertToArray {
    public static void main(String[] args) {

        ArrayList<String> city = new ArrayList<>(Arrays.asList("Ankara", "erzurum", "izmir","konya"));
        System.out.println("city = " + city);

        //1.yol donen degeri Object classa atama
        Object [] arrCity = city.toArray();
        System.out.println("Arrays.toString(arrCity) = " + Arrays.toString(arrCity));

        //2.yol toArray methodu ile
        String [] arrCity2 = city.toArray(new String[0]);
        System.out.println("Arrays.toString(arrCity2) = " + Arrays.toString(arrCity2));


    }
}
