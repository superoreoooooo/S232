package win.oreo;

import java.util.Random;

public class Cylinder {
    public static void main(String[] args){
        System.out.println(b(5, 8));
        System.out.println(b(4));
    }

    public static double volume(int r, int h) {
        return Math.PI * r * r * h;
    }

    public static int a() {
        return new Random().nextInt(6) + 1;
    }

    public static int b(int a, int b) {
        return new Random().nextInt(Math.min(a, b), Math.max(a, b)) + 1;
    }

    public static int b(int a) {
        return new Random().nextInt(a) + 1;
    }
}
