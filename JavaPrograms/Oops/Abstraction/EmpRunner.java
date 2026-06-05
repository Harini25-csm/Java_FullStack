package Oops.Abstraction;

class EmpRunner extends Employee {
    @Override
    void employDetails(int eid, String ename, int salary) {
        System.out.println("Employee name: " + ename);
        System.out.println("Employee id: " + eid);
        System.out.println("Employee salary: " + salary);
    }

    @Override
    void employBehavior(int s, int ewhm) {
        int total = s + ewhm;
        System.out.println("Employee working based on no.of hours he worked: " + total);
    }
}
