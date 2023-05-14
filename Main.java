package GitCourse;

public class Main {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        int c = 10;
        int d = 10;

        int e = 15;
        int f = 10;

        boolean canFit = false;

        if ((a <= e && b <= f) || (a <= f && b <= e)) {
            if ((c <= e && d <= f) || (c <= f && d <= e)) {
                canFit = true;
            }
        }
        if (canFit) {
            System.out.println("Оба дома помещаются на участке.");
        } else {
            System.out.println("Один или оба дома не помещаются на участке.");
        }
    }
}
