package ch26_Exception;

public class C06_NumberFormatException{
    public static void main(String[] args) {
        // NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method runn ederek ınteger'e
// cevirildiğinde oluşan RTE exception
// java'da String içinde ki rakam karakterler parseInt() method ile ınt değere atanabilir


        String str = "1516";
        System.out.println("(str+53) = " + (str + 53));

        int sayi = Integer.parseInt(str);
        System.out.println("sayi = " + (sayi + 53));

        String id = "id12345";
        // RTE int sayi2 = Integer.parseInt(id);

        try {
            int sayi2 = Integer.parseInt(id);
            System.out.println("kod hatasiz calisti mesaji");
        } catch (NumberFormatException e) {
            System.err.println("Exception in thread \"main\" java.lang.NumberFormatException");
        }

        try {
            int sayi3 = Integer.parseInt(str);
            System.out.println("kod hatasiz calisti mesaji");
        } catch (NumberFormatException e) {
            System.err.println("Exception in thread \"main\" java.lang.NumberFormatException");
        }



    }
}
