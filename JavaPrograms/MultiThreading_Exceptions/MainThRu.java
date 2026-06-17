package MultiThreading_Exceptions;

public class MainThRu {
    public static void main(String[] args) {
        // Step 1: Create object of Th class
        // Thread is CREATED but not started yet
        Th t = new Th();
        // Assign a name to the thread
        t.setName("Swiggy");
        // Print thread name
        System.out.println("Thread Name : " + t.getName());
        // Step 2: Start the thread
        // JVM creates a new thread and calls run()
        t.start();
        // --------------------------------------------------
        // Step 3: Create Runnable object
        Ru r = new Ru();
        // Step 4: Pass Runnable object to Thread
        Thread tr = new Thread(r);
        // Assign name to the thread
        tr.setName("PhonePe");
        // Print thread name
        System.out.println("Thread Name : " + tr.getName());
        // Step 5: Start PhonePe thread
        tr.start();
        // --------------------------------------------------
        // Step 6: Create another Runnable object
        Ru1 r1 = new Ru1();
        // Step 7: Create Thread object using Runnable
        Thread tr1 = new Thread(r1);
        // Set thread name
        tr1.setName("Amazon");
        // Print thread name
        System.out.println("Thread Name : " + tr1.getName());
        // Step 8: Start Amazon thread
        tr1.start();
        // Main thread continues its execution independently
        System.out.println("Main Thread Finished");
    }
}

/*
main()
│
├── Create Swiggy Thread (NEW State)
│
├── t.start()
│     │
│     └── JVM creates Swiggy Thread
│            └── run()
│                 └── Order food from Swiggy
│
├── Create PhonePe Runnable
│
├── Create Thread(tr)
│
├── tr.start()
│     │
│     └── JVM creates PhonePe Thread
│            └── run()
│                 └── Paying 200 Rs through PhonePe
│
├── Create Amazon Runnable
│
├── Create Thread(tr1)
│
├── tr1.start()
│     │
│     └── JVM creates Amazon Thread
│            └── run()
│                 └── Purchasing laptop from Amazon
│
└── Main Thread Ends
*/