package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_api {
    public static void main(String[] args) {
        List<Integer> l = Stream.iterate(0, x -> x+1)
                .limit(4)
                .filter(x -> x%2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted((a,b) -> b-a )
                .skip(1)
                .peek(x -> System.out.println(x))
                .collect(Collectors.toList());


        Integer i = Stream.iterate(0, x -> x+1)
                .limit(101)
                .peek(System.out::println)
                .max((a,b) -> a-b)
                .get();

        System.out.println(i);

        long a = Stream.iterate(0, x -> x+1)
                .limit(101)
                .count();
        System.out.println(a);
    }
}
