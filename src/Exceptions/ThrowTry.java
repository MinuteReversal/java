package Exceptions;

public class ThrowTry {
    public static void main(String[] args) {
        try {
            throw new Error("hello world");
        } catch (Error ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("complete");
        }
    }
}
