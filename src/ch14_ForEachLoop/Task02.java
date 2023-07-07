package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {

        int [] arr = {1,2,-3,4,-5,-6};

        tersIsaret(arr);

        System.out.println();
        isaretDegis(arr);






    }

    private static void isaretDegis(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int each : arr) {
            each *= -1;
            list.add(each);
        }
        System.out.println(list);
    }

    private static void tersIsaret(int[] arr) {
        for (int w: arr) {
            w *= -1;
            System.out.print(w + " ");
        }
    }
}
