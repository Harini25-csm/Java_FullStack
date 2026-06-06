//Single-level Inheritance
package Oops.Inheritance;

public class EmployeeSi {
    String name;
    int age;
    double salary;
    static class Employ extends EmployeeSi{}//using static in this line helps
    // not to create the obj for employ again
    public static void main(String[] args) {
        Employ e=new Employ();
        System.out.println("Employee details:");
        System.out.println(e.name="Harini");
        System.out.println(e.age=25);
        System.out.println(e.salary=50000.0);
    }
}
