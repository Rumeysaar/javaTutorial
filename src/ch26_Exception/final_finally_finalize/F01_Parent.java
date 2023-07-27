package ch26_Exception.final_finally_finalize;

public class F01_Parent {
    public void testMethod(){
        System.out.println("guven kontrole mani degildir");
    }
    // final method cannot be overridden
    public final void finalMethod(){
        System.out.println("final methoddan gelirlerse");
    }

}
