package win.oreo;

public class d0919 {
    public static void main(String[] args) {
        System.out.println(printG(90));
    }

    public static String printG(int s) {
        String grade = "";

        if (s >= 90) {
            grade = "A";
        } else if (s >= 80) {
            grade = "B";
        } else if (s >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }

        return grade;
    }
}
