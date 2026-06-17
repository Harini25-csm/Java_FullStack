package MultiThreading_Exceptions;

public class TaskRS extends Thread{
    @Override
    public void run(){
        System.out.println("Thread: "+Thread.currentThread().getName());
        System.out.println("Task Executing.....");
    }
}
