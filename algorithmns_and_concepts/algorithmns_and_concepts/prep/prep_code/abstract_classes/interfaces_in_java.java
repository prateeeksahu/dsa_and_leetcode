package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

interface top{
    void meth1();
    default void meth2(){
        System.out.println("meth2");
    }
}

interface mid extends top {
    void meth3();
    void meth4();

}

interface newone extends mid{
    default void meth5(){
        System.out.println("meth5");
    }

    void meth6();
}

class bottom implements mid,newone {
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }

    @Override
    public void meth6() {
        System.out.println("meth6");
    }

    public void meth7(){
        System.out.println("meth7");
    }
}

public class interfaces_in_java {
    public static void main(String[] args) {
        mid obj = new bottom();

        obj.meth2();
        obj.meth1();
        obj.meth7();


    }
}


