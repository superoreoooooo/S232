package win.oreo;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world! " + (i + 1));
        }

        A aa = new A(20, "c");

        System.out.println(aa.getA());
        System.out.println(aa.getB());

        System.out.println(aa);
    }
}

class A {
    private int a;
    private String b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public A(int a, String b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {
        return a + b;
    }
}