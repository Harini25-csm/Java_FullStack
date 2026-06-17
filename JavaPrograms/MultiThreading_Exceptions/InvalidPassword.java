package MultiThreading_Exceptions;

public class InvalidPassword extends Exception{
    // public InvalidPassword (String msg){
    //     super(msg);
    // }
    private String msg;
    InvalidPassword(String msg){
        this.msg=msg;
    }
    public String getMessage(){
        return msg;
    }
}
