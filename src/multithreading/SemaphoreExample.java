package multithreading;

import java.util.concurrent.*;

public class SemaphoreExample {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // Allow two permits

        Runnable task = () -> {
            try {
                semaphore.acquire(); // Acquire a permit
                System.out.println("Task started by " + Thread.currentThread().getName());
                Thread.sleep(2000); // Simulating task execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release(); // Release the permit
                System.out.println("Task completed by " + Thread.currentThread().getName());
            }
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }
}
