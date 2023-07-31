package ch29_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("numberList ilk hali = " + numberList);

        ListIterator<Integer> itr = numberList.listIterator();

        while (itr.hasNext()){
            itr.next();
        }
        while (itr.hasPrevious()) {
           int num = itr.previous();
           if (num % 2 == 1){
             itr.set ((int) Math.pow(num, 2));
           }else itr.remove();
        }
        System.out.println("numberList son hali = " + numberList);
    }
}
