//https://stackoverflow.com/questions/14524751/cast-object-to-generic-type-for-returning
package Methods;

public class GenericMethod {
    static <T extends Number> T add(T x, T y, Class<T> clazz) {
        T t = null;
        if (x instanceof Integer) {
            t = clazz.cast((Integer) x + (Integer) y);
        } else if (x instanceof Float) {
            t = clazz.cast((Float) x + (Float) y);
        }
        return t;
    }

    public static void main(String[] args) {
        var ri = add(10, 10, Integer.class);
        System.out.println(ri);
        var rf = add(3.14f, 0.13f, Float.class);
        System.out.println(rf);
    }
}
