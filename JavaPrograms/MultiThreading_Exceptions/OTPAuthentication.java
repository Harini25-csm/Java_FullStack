package MultiThreading_Exceptions;

public class OTPAuthentication extends RuntimeException {
    private String msg;

    public OTPAuthentication(String msg) {
        this.msg=msg;
    }
    public String getMessage(){
        return msg;
    }



    // private String msg;
    
    // public OTPAuthentication(String msg){
    //     super(msg);
    // }
}
