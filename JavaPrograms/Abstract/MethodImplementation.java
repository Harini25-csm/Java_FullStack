// write a jav a program by following senario
//1. create a class named as methods implemetation,
//2. create  a paramerized method having 3 peramerter by diff types which is accessed inside the method
//3. create str returning method by passing the parameter of int, string, int that to be accessed inside the method
// 4. create a static method which returns boolean type of implemeting even or odd num

package Abstract;
public class MethodImplementation {
    public void display(int a,String s, float f){
        System.out.println("Enter a value:"+a);
        System.out.println("Enter a str:"+s);
        System.out.println("Enter a float value:"+f);
    }
    public String strMessage(int a,String s,int b){
        return a+s+b;
    }
    public static boolean evenOrOdd(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        MethodImplementation a=new MethodImplementation();
        a.display(1,"Harini",2);
        System.out.println(a.strMessage(3,"I am studing javaFullStack",4));
        System.out.println(a.evenOrOdd(4));
        
        
    }
}
