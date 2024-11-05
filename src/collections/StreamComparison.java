package collections;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamComparison {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(0, 54).boxed().toList();

        long startTime = System.currentTimeMillis();
        numbers.stream().mapToInt(StreamComparison::compute).sum();
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential stream time: " + (endTime - startTime) + " ms" + numbers);

        startTime = System.currentTimeMillis();
        numbers.parallelStream().mapToInt(StreamComparison::compute).sum();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel stream time: " + (endTime - startTime) + " ms");
    }

    private static int compute(int value) {
        // Simulate a computationally intensive task
        try
        {
            Thread.sleep(1);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return value * 2;
    }
}

