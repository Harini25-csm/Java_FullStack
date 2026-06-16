package MultiThreading_Exceptions;

// Ru class implements Runnable
// This is another way of creating a thread
public class Ru implements Runnable {
    // Task to be executed by the thread
    public void run() {
        System.out.println("Paying 200 Rs through PhonePe");
    }
}