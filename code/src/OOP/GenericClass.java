package OOP;

class SafeBox<T> {
    private T content = null;

    T get() {
        return content;
    }

    void set(T value) {
        content = value;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        SafeBox<String> safeBox1 = new SafeBox<String>();
        safeBox1.set("hello world");
        System.out.println(safeBox1.get());

        SafeBox<Double> safeBox2 = new SafeBox<Double>();
        safeBox2.set(3.14);
        System.out.println(safeBox2.get());

    }
}
