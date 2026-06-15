package MultiThreading;

// Th class extends Thread
// This is one way of creating a thread
public class Th extends Thread {
    // Code inside run() executes in a separate thread
    public void run() {
        System.out.println("Order food from Swiggy");
    }
}