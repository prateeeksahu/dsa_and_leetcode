package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes.executor_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class executor {

    private static long factorial(int n) throws InterruptedException {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long r = 1;
        for(int i = 1; i<=n; i++) r *= i;
        return r;

    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i = 1; i<10; i++){
            int finalI = i;
            executor.submit(() -> {
                long result = 0;
                try {
                    result = factorial(finalI);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(result);
            });
        }
        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
