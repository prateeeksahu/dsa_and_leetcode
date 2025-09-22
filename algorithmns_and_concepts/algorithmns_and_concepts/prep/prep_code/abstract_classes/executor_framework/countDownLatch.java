package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes.executor_framework;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;


class dser implements Callable<String> {
    private final CyclicBarrier c;

    public dser(CyclicBarrier c){
        this.c = c;
    }

    public String call() throws InterruptedException, BrokenBarrierException {
        System.out.println(Thread.currentThread().getName() + " Started");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " Waiting at barrier");
        c.await();
        return "ok";
    }
}

public class countDownLatch{
    public static void main(String[] args) throws InterruptedException {
        int n = 3;
        ExecutorService e = Executors.newFixedThreadPool(n);
        CyclicBarrier c = new CyclicBarrier(n);

        e.submit(new dser(c));
        e.submit(new dser(c));
        e.submit(new dser(c));

        System.out.println("Main released");
        e.shutdown();

        AtomicInteger am = new AtomicInteger();

    }
}
