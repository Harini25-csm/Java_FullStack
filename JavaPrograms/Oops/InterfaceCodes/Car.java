package Oops.InterfaceCodes;

public class Car extends Vehicle implements AMulp, BMulp {
    @Override
    public void veType(String type) {
        super.veType(type);//super refers to the parent class object.
        System.out.println("Car type: "+type);
    }

    @Override
    public void method1() {
        System.out.println("method1() called");
    }

    @Override
    public void method2() {
        System.out.println("method2() called");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.veType("SUV");
        car.method1();
        car.method2();
    }
}
