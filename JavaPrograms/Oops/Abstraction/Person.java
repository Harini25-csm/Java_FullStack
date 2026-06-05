package Oops.Abstraction;

abstract class Person {
    abstract int salary(int amount, int bonus);//abstract method
}
class Harini extends Person {
    @Override
    int salary(int amount, int bonus) {
        return amount + bonus;
    }
}
class PersonDemo {
    public static void main(String[] args) {
        Person p = new Harini();
        int total = p.salary(20000, 2000);
        System.out.println("Monthly salary: " + total);
    }
}
