package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes.generics;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;

import static java.lang.StringUTF16.compareTo;


abstract class hello implements Comparable{
    public hello(){
        super();
    }
}

public class generics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(1000);

        list.sort(Comparator.comparing())
        list.add("hello");
        list.add(123); // throws error now

        ArrayList<Integer> li = new ArrayList(1000);

        li.remove((Integer) 1);
    }
}
