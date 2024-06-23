package multithreading;

import java.util.concurrent.*;

public class CallableFutureExample {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable = () -> 124;

        Future<Integer> future = executorService.submit(callable);
        try {
            System.out.println("Result: " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
