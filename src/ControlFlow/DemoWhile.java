package ControlFlow;

public class DemoWhile {
    public static void main(String[] args) {
        int x = 3;
        while (true) {
            if (x-- == 0) {
                break;
            }
        }
    }
}
