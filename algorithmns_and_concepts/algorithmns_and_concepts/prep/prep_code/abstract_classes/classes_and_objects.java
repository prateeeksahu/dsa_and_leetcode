package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

import org.w3c.dom.ls.LSOutput;

class folder{
    final String name;
    final int size;

    public folder(String name, int size) {
        this.name = name;
        this.size = size;
    }
}

class file{
    void sout(){
        System.out.println("file");
    }
}

public class classes_and_objects {
    public static void main(String[] args) {

        folder f = new folder("raju", 10);
        System.out.println(f.name);

//        file ff = new sout();

    }



}
