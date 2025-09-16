package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

class SharedBuffer {
    private int data;
    private boolean hasData = false; // flag

    // Producer puts data
    public synchronized void produce(int value) {
        while (hasData) {  // buffer full
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // wake up consumer
    }

    // Consumer takes data
    public synchronized int consume() {
        while (!hasData) {  // buffer empty
            try { wait(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // wake up producer
        return data;
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;
    Producer(SharedBuffer buffer) { this.buffer = buffer; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;
    Consumer(SharedBuffer buffer) { this.buffer = buffer; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }
}

public class threadCommunication {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);
        p.start();
        c.start();
    }
}
