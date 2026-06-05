package Oops.Encapsulation;

public class Employ {
    private String name;
    private int age;
    public void setter(String n,int a){
        this.name=n;
        this.age=a;
    }
    public String getter(){
        return name+" and age is "+age;
    }
    public static void main(String[] args) {
        Employ e=new Employ();
        e.setter("Harini", 19);
        System.out.println(e.getter());
    }
}
