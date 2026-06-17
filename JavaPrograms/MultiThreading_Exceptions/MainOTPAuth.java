package MultiThreading_Exceptions;
import java.util.Scanner;
public class MainOTPAuth {
    public static void verifyOTP(int otp) throws OTPAuthentication{
        int originalOTp=9876;
        if(otp!=originalOTp){
            System.out.println("Invalid OTP");
        }
        else
            System.out.println("OTP verified successfully");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter OTP:");
        int otp=sc.nextInt();
        try{
            verifyOTP(otp);
        }
        catch(OTPAuthentication e){
            System.out.println(e.getMessage());
        }
    }
}
