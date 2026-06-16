package MultiThreading_Exceptions;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal=10000;
        System.out.println("Enter the amt to withdraw:");
        int amt=sc.nextInt();
        sc.close();
        if(amt<=bal)
            System.out.println("withdraw successfully!");
        else
            try{
               throw new InsufficientBalanceException("insufficient balance");
            }
            catch(InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
    }
}
