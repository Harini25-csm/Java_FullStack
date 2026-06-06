package Oops.Inheritance;

public class EmployeeHi {
    String name;
    int age;
    float salary;
    
    static class permanentEmployee extends EmployeeHi{}
    static class contractEmployee extends EmployeeHi{}
    public static void main(String[] args) {
        permanentEmployee p=new permanentEmployee();
        System.out.println("Permamant Employee:");
        System.out.println(p.name="Harini");
        System.out.println(p.age=32);
        System.out.println(p.salary=32000.0f);
        System.out.println();
        contractEmployee c=new contractEmployee();
        System.out.println("Contract Employee:");
        System.out.println(p.name="Iqra");
        System.out.println(p.age=35);
        System.out.println(p.salary=40000.0f);
    }
}
