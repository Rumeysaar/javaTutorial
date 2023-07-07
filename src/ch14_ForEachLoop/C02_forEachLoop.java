package ch14_ForEachLoop;

public class C02_forEachLoop {
    public static void main(String[] args) {
        int [][] arr = {{2,5,6,8},{9,2,5,8},{3,5,7,9}};

        int carpim = 1;
        int carpim1 = 1;
        for (int[] i:arr) {
            for (int j : i) {
                carpim *= j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim1 *= arr[i][j];
            }
        }
        System.out.println(carpim1);
        System.out.println(carpim);





    }
}
