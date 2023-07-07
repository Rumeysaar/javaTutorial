package ch12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        int [] arr; // deger atanmamis int data type array

        String [] nameArray = {"Rumeysa", "Ahmet", "Zeynep", "Tommy", "Ali", "Omer"};

        int [] numArray = {11,222,33,45,33,567,45,984};// ayni eleman birden fazla kez yazilabilir

        int [] sayiArr = new int [5];
        sayiArr [0] =35;
        sayiArr [1] =42;
        sayiArr [2] =7;
        sayiArr [3] =56;
        sayiArr [4] =81;
        // System.out.println(sayiArr); [I@56cbfb61 = reference value
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        // deger olarak gormk icin toString methodu

        System.out.println("sayiArr.length = " + sayiArr.length);
        System.out.println("nameArray.length = " + nameArray.length);
        System.out.println("numArray.length = " + numArray.length);

       System.out.println("sayiArr = " + sayiArr [sayiArr.length-1]);
        System.out.println("nameArray[nameArray.length-1] = " + nameArray[nameArray.length - 1]);
        System.out.println("numArray[numArray.length-1] = " + numArray[numArray.length - 1]);

        nameArray [nameArray.length-1] = "veli";
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));

        for (int i = 0; i < nameArray.length; i++) {
            System.out.print("nameArray[i] = " + nameArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numArray.length; i+=2) {
            System.out.print("numArray[i] = " + numArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i].length() == 5)
                System.out.println(nameArray[i]);

        }

        System.out.println("sort");
        System.out.println(Arrays.toString(nameArray));
        System.out.println(Arrays.toString(numArray));
        System.out.println(Arrays.toString(sayiArr));

        Arrays.sort(nameArray);
        Arrays.sort(numArray);
        Arrays.sort(sayiArr);

        System.out.println(Arrays.toString(nameArray));
        System.out.println(Arrays.toString(numArray));
        System.out.println(Arrays.toString(sayiArr));


    }
}
