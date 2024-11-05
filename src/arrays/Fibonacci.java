package arrays;

import java.time.Instant;

public class Fibonacci {


        public static void main(String[] args) {
            System.out.println("Before " + Instant.now());
            System.out.println(findNthFibonacci());
            System.out.println("After " + Instant.now());
        }

        private static long findNthFibonacci() {
            if (500000 == 0) {
                return 0;
            }
            if (500000 == 1) {
                return 1;
            }

            long a = 0;
            long b = 1;
            long fib = 1;

            for (int i = 2; i <= 500000; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
            return fib;
        }


}
