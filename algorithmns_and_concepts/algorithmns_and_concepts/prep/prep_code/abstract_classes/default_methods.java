package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

import java.util.Scanner;

interface hello{
    static void sayBye(){
        System.out.println("bye");
    }
}

class sayByeChild implements hello{
    static void sayBye(){
        System.out.println("hellobye");
    }
}

public class default_methods {
    public static void main(String[] args) {
        sayByeChild s = new sayByeChild();

        s.sayBye();
        final int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }
}
