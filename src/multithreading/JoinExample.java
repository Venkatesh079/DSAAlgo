package multithreading;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 started");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.println("Thread 1 completed");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("Thread 2 completed");
        });

        thread1.start();
        thread2.start();

        thread1.join(); // Main thread waits for thread1 to complete
        thread2.join(); // Main thread waits for thread2 to complete

        System.out.println("All threads completed");
    }
}

