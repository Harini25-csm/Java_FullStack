package MultiThreading_Exceptions;

public class Jerry implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("i:" + i + " " + Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
