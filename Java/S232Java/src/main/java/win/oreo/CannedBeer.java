package win.oreo;

public class CannedBeer {
    public static void main(String[] args) {
        buy(20);
        buy(18);
    }

    private static void buy(int age) {
        if (age >= 20) {
            System.out.println("able " + age);
        } else {
            System.out.println("unable " + age);
        }
    }
}
