package MultiThreading_Exceptions;

public class MainTaskRS {
    public static void main(String[] args) {
        TaskRS task=new TaskRS();
        Thread t=new Thread(task,"EmployeeThread");
        t.start();
    }
}
