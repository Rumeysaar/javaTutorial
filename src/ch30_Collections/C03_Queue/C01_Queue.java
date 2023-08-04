package ch30_Collections.C03_Queue;

import java.util.*;

public class C01_Queue {
    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>(Arrays.asList("almanya","hollanda",
                "fransa","amerika","afrika","brezilya","yeni zellanda"));
        System.out.println(q1);

        q1.add("turkiye");

        System.out.println(q1);

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("almanya","hollanda",
                "fransa","amerika","afrika","brezilya","yeni zellanda"));

        System.out.println(q2);
        q2.add("Turkiye");
        q2.add("angola");
        System.out.println(q2);

        System.out.println("q2.peek() = " + q2.peek());
        System.out.println("q2.remove() = " + q2.remove());

        System.out.println("q2 = " + q2);

        System.out.println("q2.poll() = " + q2.poll());
        System.out.println("q2 = " + q2);
        System.out.println("q2.element() = " + q2.element());
        System.out.println("q2 = " + q2);

        q1.clear();
        System.out.println("q1 = " + q1);

       //peek()-> copt-paste gibi ilk elemanı return eder ama silmez
       //poll()-> cut-paste gibi ilk elemanı siler ve  return eder
       //element() -> ilk elemanı silmeden return eder.
       //remove() -> ilk elemnı siler ve return eder..


    }
}
