package NewCodes;

import java.util.Scanner;

public class Automorphic_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a num:");
        int n=sc.nextInt();
        int square=n*n;
        int c=0;
        int temp=n;
        while(n>0){
            c++;//digits count in given num
            n/=10;
        }
        System.out.println(square%(int) Math.pow(10,c)==temp?"Automorphic_num":"not Automorphic_num");
    }
}
/*
n=5 =>square=25   =>5==5
n=25 =>s=625  ==> 25(from square)=25
*/
