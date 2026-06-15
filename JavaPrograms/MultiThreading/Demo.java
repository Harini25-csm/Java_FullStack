package MultiThreading;

public class Demo {
    public static void main(String[] args) {
        // JVM automatically creates some predefined threads
        // such as Main Thread, Garbage Collector Thread, etc.
        // Create a new Thread object using default constructor
        // Thread is created but not started
        Thread t = new Thread();
        // Display unique thread ID
        System.out.println("Id: " + t.getId());
        // Default thread name assigned by JVM
        System.out.println("Name: " + t.getName());
        // Default priority of every thread is 5
        System.out.println("Priority: " + t.getPriority());
        // ------------------------------------------------
        // Create a thread with a custom name
        Thread n = new Thread("Harini");
        // Display thread ID
        System.out.println("Id: " + n.getId());
        // Display custom thread name
        System.out.println("Name: " + n.getName());
        // ------------------------------------------------
        // Change thread priority from default 5 to 7
        n.setPriority(7);
        // Display updated priority
        System.out.println("Priority: " + n.getPriority());
        // Change thread name from Harini to Iqra
        n.setName("Iqra");
        // Display updated name
        System.out.println("Name: " + n.getName());
    }
}