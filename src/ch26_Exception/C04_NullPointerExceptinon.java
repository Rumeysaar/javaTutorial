package ch26_Exception;

public class C04_NullPointerExceptinon {
    public static void main(String[] args) {

        String str = "";
        System.out.println("str.length() = " + str.length());

        String str1 = null;
        //System.out.println("str1.length() = " + str1.length());

        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu mesaj null in lenghtini aldigin icin");
        } catch (NullPointerException e) {
            System.out.println("null in lenghti olur mu ");
        }
        try {
            System.out.println("str.length() = " + str.length());
            System.out.println("bu mesaj \"\" in lenghtini aldigin icin");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
