package MultiThreading_Exceptions;
import java.util.Scanner;
public class MainOTPAuth {
    public static void main(String[] rags){
        int originalOTP = 9876;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter otp:");
        int otp = sc.nextInt();
        sc.close();

        try {
            if (otp != originalOTP) {
                throw new OTPAuthentication("Invalid OTP");
            }
            System.out.println("OTP verified successfully");
        } catch (OTPAuthentication e) {
            System.out.println(e.getMessage());
        }
    }





    // public static void verifyOTP(int otp) throws OTPAuthentication{
    //     int originalOTp=9876;
    //     if(otp!=originalOTp){
    //         System.out.println("Invalid OTP");
    //     }
    //     else
    //         System.out.println("OTP verified successfully");
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter OTP:");
    //     int otp=sc.nextInt();
    //     try{
    //         verifyOTP(otp);
    //     }
    //     catch(OTPAuthentication e){
    //         System.out.println(e.getMessage());
    //     }
    // }
}
