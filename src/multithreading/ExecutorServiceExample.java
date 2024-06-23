package multithreading;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount + " cores available");
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
        for(int i = 0; i < 100; i++) {
            executorService.execute(new CpuIntensiveTask());
        }

    }

   static class CpuIntensiveTask implements Runnable {
       @Override
       public void run() {
           System.out.println("CpuIntenseveTask");
       }
   }
}
