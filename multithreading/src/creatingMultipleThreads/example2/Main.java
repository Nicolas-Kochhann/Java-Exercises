package creatingMultipleThreads.example2;

public class Main {
    public static void main(String[] args) {

        // Instantiating executable class
        MyRunnable myRunnable = new MyRunnable();

        // Creating threads
        Thread t0 = new Thread(myRunnable);
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);

        // If you run this threads a few times, you will notice that
        // the order of the printed threads is not always the same.
        t0.start();
        t1.start();
        t2.start();
        /*
         This happens because this threads are running at the same
         time, and not sequentially. Even thought the Thread-0 run before
         Thread-1, Thread-0 can finish after Thread-1 has be executed
         and terminated.

         When you run multiple threads, you can`t control what will finish
         first. The CPU have the capability to decide what thread execute.
        */

    }
}
