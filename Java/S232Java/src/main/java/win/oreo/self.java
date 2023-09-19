package win.oreo;

public class self {
    public static void main(String[] args) {
        p(2);
    }

    public static void p(int i) {
        System.out.println(i == 0 ? "0" : (i % 2 == 0 ? "f" : "x"));
    }
}
