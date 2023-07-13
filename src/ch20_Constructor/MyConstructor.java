package ch20_Constructor;

public class MyConstructor {

    int x = 3;
    int y = 5;

    public MyConstructor() {
        x += 1;
    }
    public MyConstructor(int i) {
        this();
        this.y=1;
        x+=y;
        System.out.println("x = " + x);
    }
    public MyConstructor(int i, int i2) {
    this(i2);
    this.x -= i;
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4,3);
    }
}
