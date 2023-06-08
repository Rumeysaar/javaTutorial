package ch02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String name = "Zeynep Hanim";
        int age = 33;


        System.out.println(name.toUpperCase());  //ZEYNEP HANIM

        Integer age2 = 35;

        String number = "12345";

        String tc = "123456789";
        String id = "12345";

        System.out.println(tc + id); //12345678912345

        System.out.println(Integer.valueOf(tc));
        System.out.println(Integer.valueOf(id));

        int yeniTC = Integer.valueOf(tc);
        int yeniId = Integer.valueOf(id);

        System.out.println(yeniTC + yeniId);

        int yeniid = Integer.parseInt(id);


        String okulNo = "12345AB";

        // ** hatali kod RunTimeError  int okulNoYeni = Integer.valueOf(okulNo);
        // valueOf metodu hepsi rakam oldugu zaman cevirir!

        byte maxDegerByte = Byte.MAX_VALUE;
        byte minDegerByte = Byte.MIN_VALUE;

        System.out.println(maxDegerByte);  // 127
        System.out.println(minDegerByte);  //-128

        short maxDegerShort = Short.MAX_VALUE;
        short minDegerShort = Short.MIN_VALUE;

        System.out.println(maxDegerShort);
        System.out.println(minDegerShort);

        int maxDegerInt = Integer.MAX_VALUE;
        int minDegerInt = Integer.MIN_VALUE;

        System.out.println(maxDegerInt);
        System.out.println(minDegerInt);


    }
}
