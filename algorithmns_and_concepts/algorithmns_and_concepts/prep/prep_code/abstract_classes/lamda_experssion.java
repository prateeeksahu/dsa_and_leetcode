package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;


import java.lang.foreign.FunctionDescriptor;
import java.util.function.Function;

@FunctionalInterface
interface inter{
    void yoiyoi(int a, int b, String s);
}

public class lamda_experssion {
    public static void main(String[] args) {
//        inter i = (a, b, s) -> System.out.println("yoi");
//        inter i = (a, b, s) -> a+b;


        //Types of interfaces
//        function interface

        Function<String, Integer> f = x -> x.length();
        System.out.println(f.apply("ikdhsflakh"));

        Function<Integer, Integer> f2 = x -> x * 2;
        System.out.println(f.andThen(f2).apply(";aijfoahjkafdj"));
    }


}
