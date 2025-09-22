package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes.executor_framework;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class executorServiceReturn {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService s = Executors.newScheduledThreadPool(3);
        s.scheduleAtFixedRate(() -> System.out.println("hi"), 2,5, TimeUnit.SECONDS);
        s.scheduleWithFixedDelay(() -> System.out.println("hi"), 2,5, TimeUnit.SECONDS);
        s.schedule(() -> {
            System.out.println("terminating");
            s.shutdown();
        }, 30 , TimeUnit.SECONDS);

    }
}
