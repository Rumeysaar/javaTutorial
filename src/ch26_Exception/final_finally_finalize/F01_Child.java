package ch26_Exception.final_finally_finalize;

public class F01_Child extends F01_Parent{
    @Override
    public void testMethod() {
        System.out.println("childde override edildi");
    }
    //public final void finalMethod(){
    //    System.out.println("final methoddan gelirlerse");
    //}
    // 'finalMethod()' cannot override 'finalMethod()'
    // in 'ch26_Exception.final_finally_finalize.F01_Parent'; overridden method is final
}
