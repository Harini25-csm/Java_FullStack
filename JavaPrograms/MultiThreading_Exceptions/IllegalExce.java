package MultiThreading_Exceptions;

public class IllegalExce extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <=5; i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
