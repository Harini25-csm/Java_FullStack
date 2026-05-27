package Loops_patterns;
// checking given password is valid or not?

import java.util.Scanner;
public class PasswordChecker{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password:");
        String pw=sc.nextLine();
        
        // boolean hasUpper=false;
        // boolean hasLower=false;
        // boolean hasDigit=false;
        // boolean hasSpecial=false;
        
        // for(char ch:pw.toCharArray()){
        //     if(pw.length()>=8){
        //         if(ch>='A' && ch<='Z'){
        //             hasUpper=true;
        //         }
        //         if(ch>='a' && ch<='z'){
        //             hasLower=true;
        //         }
        //         if(ch>='0' && ch<='9'){
        //             hasDigit=true;
        //         }
        //         else{
        //             hasSpecial=true;
        //         }
        //     }
        // }
        // if(hasUpper && hasLower && hasDigit && hasSpecial){
        //     System.out.println("Valid password");
        // }
        // else{
        //     System.out.println("The password can't contains all characters");
        // }


        if(pw.length()>=8 && pw.matches(".*[a-z]*.") && pw.matches(".*[A-Z]*.") &&
        pw.matches(".*[0-9]*.") && pw.matches(".*[^a-zA-Z0-9]*.")){
            System.out.println("Valid password");
        }
        else{
            System.out.println("The password can't contains all characters");
        }
    }
}