package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes;

class grandparent{
    grandparent(int a){
        System.out.println("Grandparent was borned");
    }
}

class father extends grandparent{

    father(int a){
        super(a);
        System.out.println("Parent was borned");;
    }
}

class son extends father{
    son(int a){
        super(a);
        System.out.println("son is borned");
    }
}

public class inhertance {
    public static void main(String[] args) {
        son c = new son(5);
    }
}
