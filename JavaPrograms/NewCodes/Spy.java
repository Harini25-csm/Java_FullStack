package NewCodes;

import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int n=sc.nextInt();
        int sum=0, mul=1;
        while(n>0){
            int r=n%10;
            sum+=r;
            mul*=r;
            n/=10;
        }
        System.out.println(sum==mul?"Spy num":"Not spy num");
    }
}
/*
ex: n=123
sum=1+2+3=6
mul=*2*3=6
sum==mul =>spy num
*/