package MultiThreading_Exceptions;

public class MulTableT extends Thread{
    @Override
    public void run(){
        int n = 256;
        for(int i = 5; i >= 1; i--){
            System.out.println(currentThread().getName()+":"+n+"*"+i+"="+(n*i));
            try{
                Thread.sleep(35000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
