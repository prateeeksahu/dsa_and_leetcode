package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

interface inter{
    void yoiyoi(int a, int b, String s);
}

public class lamda_experssion {
    public static void main(String[] args) {
//        inter i = (a, b, s) -> System.out.println("yoi");
        inter i = (a, b, s) -> a+b;
    }
}
