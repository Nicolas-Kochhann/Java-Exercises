package creatingMultipleThreads.example1;

public class Main {
    public static void main(String[] args) {

        // Current thread
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        // New Thread
        Thread t0 = new Thread(new MyRunnable());
        t0.run(); // Running in the same thread
        t0.start(); // Running as another thread

        // Runnable as lambda
        Thread t1 = new Thread(
                () -> System.out.println(Thread.currentThread().getName()));
        t1.start();

        // You can´t start a thread more than once. Will throw exception! Test it yourself.
        // t1.start();

        // But you can run the same thing in two different threads
        Thread t2 = new Thread(new MyRunnable());
        t2.start();




    }
}
