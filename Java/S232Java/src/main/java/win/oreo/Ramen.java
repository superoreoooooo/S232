package win.oreo;

public class Ramen {
    public static void main(String[] args) {
        buy();
        boil("튀김우동");
        put();
        eat("튀김우동");
    }

    public static void boil(String n) {
        print(n + "을 먹기 위해 물을 끓인다");
    }

    public static void buy() {
        print("라면을 사온다");
    }

    public static void eat(String n) {
        print(n + "은 음 야미");
    }

    public static void put() {
        print("라면을 넣는다");
    }

    private static void print(String arg) {
        System.out.println(arg);
    }
}
