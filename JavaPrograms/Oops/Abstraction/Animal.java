package Oops.Abstraction;

public class Animal {
    abstract class A {//inner abstract class
        A() {
            System.out.println("Parent class");
        }
    }

    class B extends A {
        B() {
            super();
            System.out.println("Inherit the properties from parent class");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        B b = a.new B();
    }
}
