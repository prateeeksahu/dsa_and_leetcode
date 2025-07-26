package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

class static_test{
    public static void sayHello() {
        System.out.println("Hello from static method");
    }
}

public class static_keyword {
    public static void main(String[] args) {
        static_test obj = new static_test();

        obj.sayHello();
    }
}
