package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes.syncronization;

public class MyThread extends Thread {
    public Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for(int i = 0; i< 1000; i++) counter.incr();
    }
}
