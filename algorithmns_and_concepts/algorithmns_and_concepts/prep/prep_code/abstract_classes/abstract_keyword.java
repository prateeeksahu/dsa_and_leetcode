package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

import java.util.LinkedList;
import java.util.List;

abstract class base{
    base(){
    }

    abstract public void greet();
}

class baseC extends base{
    public void greet(){
        System.out.println("Hello!");
    }
}

interface binter{
    default void hello(){
        System.out.println("hello");
    }
}

public class abstract_keyword {

    public static void main(String[] args) {
        base b  = new baseC();
        b.greet();

        LinkedList<Integer> l = new LinkedList<>();
        List<Integer> l2 =  new  LinkedList <>();

//        binter bi = new binter();
//        bi.hello();
    }
}
