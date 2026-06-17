package MultiThreading_Exceptions;
import java.util.Scanner;
public class MainInvalidPassword {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int originalpw=1234;
        System.out.println("Enter the password:");
        int pw=sc.nextInt();
        sc.close();
        if(pw!=originalpw)
            System.out.println("Invalid password");
        else
            try{
               throw new InvalidPassword("Valid password");
            }
            catch(InvalidPassword e){
                System.out.println(e.getMessage());
            }
    }


    // public static void verifyPW(String pw) throws InvalidPassword{
    //     String originalPW = "Harini@25";
    //     if (pw == null || !pw.equals(originalPW)) {
    //         throw new InvalidPassword("Invalid password");
    //     }
    //     System.out.println("Password matched successfully!");
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the password:");
    //     String pw = sc.nextLine();
    //     try {
    //         verifyPW(pw);
    //     } catch (InvalidPassword e) {
    //         System.out.println(e.getMessage());
    //     }
    // }

}
