package OOP;

interface ICar {
    void go();
    
}

interface IPlane {
    void fly();
}

abstract class ACar implements ICar {
    String brand;
    String color;

    void openDoor() {

    }

    abstract void openTrunk();
}

class FlyCar extends ACar implements IPlane {

    FlyCar(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    @Override
    public void go() {
        System.out.println(this.color + " " + this.brand + " are go.");
    }

    @Override
    public void fly() {
        System.out.println(this.color + " " + this.brand + " are fly.");
    }

    @Override
    void openTrunk() {
        System.out.println(this.color + " " + this.brand + " trunk opened.");
    }

}

public class DemoInterface {
    public static void main(String[] args) {
        FlyCar flyCar = new FlyCar("red", "BMW");
        flyCar.fly();
        flyCar.go();
    }
}
