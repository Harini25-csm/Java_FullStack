package Arrays_Methods;

import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter a num:");
            int n=sc.nextInt();
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
