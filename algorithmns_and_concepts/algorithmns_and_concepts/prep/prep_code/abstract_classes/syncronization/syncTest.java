package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes.syncronization;

public class syncTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread m1 = new MyThread(counter);
        MyThread m2 = new MyThread(counter);

        m1.start();
        m2.start();

        try {
            m2.join();
            m1.join();
        } catch (Exception e) {

        }

        System.out.println(counter.getC());

    }
}
