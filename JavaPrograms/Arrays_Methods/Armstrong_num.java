package Arrays_Methods;

import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter a num:");
            int n=sc.nextInt();//153=>1power3+5 power3+3power3=1+125+27=153
            int temp=n;
                int sum=0;
                while(n>0){
                    int r=n%10;
                    sum+=r*r*r;
                    n=n/10;
                    
                }   
            System.out.println(temp==sum?"Armstrong num":"Not a Armstrong num");
        }
    }
