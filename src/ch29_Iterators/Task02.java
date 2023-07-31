package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task02 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        System.out.println("numberList ilk hali = " + numberList);

        ListIterator<Integer> itr = numberList.listIterator();

        while (itr.hasNext()){
            int num = itr.next();
            if (num > 20 && num < 40){
                itr.set (num);
            }else itr.remove();
        }

        //or

       // while (itr.hasNext()) {
       //     int a = itr.next();
       //     if (a < 20 || a > 40) {
       //         itr.remove();
       //     }
       // }
        System.out.println("numberList son hali = " + numberList);
    }
}
