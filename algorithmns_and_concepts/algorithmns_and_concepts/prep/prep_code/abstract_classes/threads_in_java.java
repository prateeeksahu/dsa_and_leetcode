package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

class myThread extends Thread{
    public void run(){
        for(int i = 0; i<10000; i++) System.out.println("myThread is running");
    }
}

class notMyThread extends Thread{
    public void run(){
        for(int i = 0; i<10000; i++) System.out.println("notMyThread is running");
    }
}

class myThreadRunnable implements Runnable{
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i<10000; i++) System.out.println("myThreadRunnable is running");
    }
}

public class threads_in_java {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        myThread mt = new myThread();
        notMyThread nmt = new notMyThread();
        myThreadRunnable mtr = new myThreadRunnable();

        Thread t = new Thread (mtr);


        mt.setPriority(Thread.MAX_PRIORITY);
        nmt.setPriority(10);
        mt.start();
        nmt.start();
        t.start();


    }
}


