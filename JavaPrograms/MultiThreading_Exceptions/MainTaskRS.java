package MultiThreading_Exceptions;

public class MainTaskRS {
    public static void main(String[] args) {
        TaskRS task=new TaskRS();
        task.setName("EmployeeThresd");
        task.start();
    }
}
