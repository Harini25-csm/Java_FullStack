package MultiThreading_Exceptions;

public class InsufficientBalanceException extends Exception{
    private String msg;
    InsufficientBalanceException (String msg){
        this.msg=msg;
    }
    @Override
    public String getMessage(){
        return msg;
    }
}
