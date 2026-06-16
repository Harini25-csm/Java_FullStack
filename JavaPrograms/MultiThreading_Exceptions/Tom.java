package MultiThreading_Exceptions;

public class Tom extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("i:"+i+" "+currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.getMessage();
            }
        }
    }
}
