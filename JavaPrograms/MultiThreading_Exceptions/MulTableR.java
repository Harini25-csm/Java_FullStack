package MultiThreading_Exceptions;

public class MulTableR implements Runnable{
    @Override
    public void run(){
        int n = 625;
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName()+":"+n+"*"+i+"="+(n * i));
            try{
                Thread.sleep(35000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
