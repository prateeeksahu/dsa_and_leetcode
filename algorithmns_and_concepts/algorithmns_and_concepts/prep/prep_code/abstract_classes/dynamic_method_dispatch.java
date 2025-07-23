package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

class parent{
    public void greet(){
        System.out.println("hello");
    }

    public void hi(){
        System.out.println("English me hi");
    }
}

class child extends parent{
    public void greet(){
        System.out.println("namste");
    }

    public void hi2(){
        System.out.println("English me hi from child ");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {

        parent c = new child();
        c.hi();
        //c.hi2(); = not allowed

//        child obj = new parent();

    }
}
