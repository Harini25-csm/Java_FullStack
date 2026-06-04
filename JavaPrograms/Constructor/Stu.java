package Constructor;

public class Stu {
    private String name;
    private int age;
    public void setter(String n,int a){
        if(age>18){
        name=n;
        age=a;
        }
        else{
            System.out.println("Age must be greater than 18");
        }
        
    }
    public String getter(){
        return name+" and age is "+age;
        
    }
    public static void main(String[] args) {
        Stu e=new Stu();
        e.setter("Harini", 17);
        System.out.println(e.getter());
        
    }
}
