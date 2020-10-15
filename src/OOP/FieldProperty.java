package OOP;

class A {
    private String _field = "";

    public String getField() {
        return _field;
    }

    public void setField(String value) {
        this._field = value;
    }
}

public class FieldProperty {
    public static void main(String[] args) {
        A a = new A();
        a.setField("hello world");
        System.out.println(a.getField());
    }
}
