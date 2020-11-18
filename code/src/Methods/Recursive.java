package Methods;

public class Recursive {
    static int fn(int x) {
        if (x > 1) {
            return x + fn(x - 1);
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(fn(3));
    }
}
