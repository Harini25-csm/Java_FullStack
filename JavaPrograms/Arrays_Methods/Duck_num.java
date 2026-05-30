package Arrays_Methods;

import java.util.Scanner;

public class Duck_num {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num:");
        int n=sc.nextInt();
            while(n>0){
                int r=n%10;
                if(r==0){
                    System.out.println("duck number");
                    return;
                }
                n=n/10;
                
            }
            System.out.println("not a duck num");
        }
    }

/*
0123 =>not duck num
102, 1230, 1300,0120 =>duck num
*/