package MultiThreading_Exceptions;

public class MainTJ {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Tom t = new Tom();
        t.setName("Tom");
        t.start();
        Thread j = new Thread(new Jerry());
        j.setName("Jerry");
        j.start();
    }
}
