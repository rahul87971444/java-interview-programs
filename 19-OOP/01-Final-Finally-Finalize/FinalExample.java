class Parent {

    final int VALUE = 100;

    final void display() {
        System.out.println("This method cannot be overridden");
    }
}

final class Vehicle {

    void drive() {
        System.out.println("Vehicle is driving");
    }
}

public class FinalExample {

    public static void main(String[] args) {

        Parent obj = new Parent();

        System.out.println(obj.VALUE);

        obj.display();

        Vehicle vehicle = new Vehicle();

        vehicle.drive();
    }
}
