package ch15_Varargs;

public class Task02 {
    public static void main(String[] args) {

        int [] arr = {2,55,66,88,5,2,4,5,6,3,8,55,33,34,35};

        toplamCarp();






    }

    private static void toplamCarp(int ... i) {
        int toplam = 0;
        for (int j = 1; j < i.length ; j++) {
            toplam += i[j];
        }
        //toplam *= i;


    }
}
