package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes.syncronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int c = 0;

    public synchronized void incr(){



        synchronized (this){
            c++;
        }
    }

    public int getC(){
        return c;
    }
}
