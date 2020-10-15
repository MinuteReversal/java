class Car {
    String brand;
    String color;

    void go() {
        System.out.println(color + " " + brand + " are go.");
    }
}

class DemoClass {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.color = "White";
        bmw.go();
    }
}
