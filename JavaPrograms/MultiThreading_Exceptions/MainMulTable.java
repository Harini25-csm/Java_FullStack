package MultiThreading_Exceptions;

public class MainMulTable {
    public static void main(String[] args) {
        MulTableT m=new MulTableT();
        m.start();
        //m.start(); //IllegalThreadStateException
    Thread j =new Thread(new MulTableR());
    j.start();
    }
}
