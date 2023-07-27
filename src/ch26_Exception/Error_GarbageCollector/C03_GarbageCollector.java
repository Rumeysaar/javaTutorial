package ch26_Exception.Error_GarbageCollector;

public class C03_GarbageCollector {

    @Override
    protected void finalize()  {
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {

        C03_GarbageCollector s1 = new C03_GarbageCollector();
        C03_GarbageCollector s2 = new C03_GarbageCollector();

        s1 = null;
        s2 = null;

        System.gc(); //yani Jvm System.gc() komutu ile finalize methodu tetiklendi ve null atanan değerler temizlendi

        /*
  Note: The Garbage collector of JVM collects only those objects that are created by new keyword.
  So if you have created any object without new, you can use finalize method to perform cleanup processing
   (destroying remaining objects).
   */
    }



}
