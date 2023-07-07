package ch15_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {

        int [] arr ={ 1,2,-3,4,-5,-6 } ;


        arrToplam(arr);
        varargsTopla(arr);






    }

    private static int varargsTopla(int...var) {
        int toplam = 0;
        for (int w : var) {
            toplam += w;
        }
        System.out.println("toplam = " + toplam);
        return toplam;
    }

    private static void arrToplam(int[] arr) {
        int toplam = 0;
        for (int w : arr) {
            toplam += w;
        }
        System.out.println("toplam = " + toplam);
    }
}
