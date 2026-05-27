package Arrays;

public class Methods {
    // // Using void
    // static void greeting(String name){
    //     System.out.println("Hello, "+ name+"!");
    // }
    // public static void main(String[] args) {
    //     greeting("Harini");
    //     greeting("Iqra");
    //     greeting("Shazia");

    // }


    //Usimg int 
    static int add(int a, int b){
        int sum=a+b;
        return sum;
    }
    static int max(int x,int y){
        if(x>y) return x;
        else return y;
    }
    public static void main(String[] args) {
        int result=add(10,20);
        int maxele=max(23,8);
        System.out.println(result);
        System.out.println(maxele);
    }
}
