package Loops_patterns;
public class Strong_num {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=145;
        int temp=n;
        int factSum=0;
        while(n>0){
            int r=n%10;
            factSum=factSum+fact(r);    
            n=n/10;
        }
        if(factSum==temp) System.out.println("Strong number");
        else System.out.println("Not a strong number");

        // int n=145;
        // int temp=n;
        // int sum=0;
        // while(n>0){
        //     int f=1;
        //     int r=n%10;
        //     for(int i=1;i<=r;i++){
        //         f=f*i;
        //     }
        //     sum=sum+f;
        //     n=n/10;
        // }
        // if(temp==sum) System.out.println("Strong number");
        // else System.out.println("Not a strong number");
    }
}
