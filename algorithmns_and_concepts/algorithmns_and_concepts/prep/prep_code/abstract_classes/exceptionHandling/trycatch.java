package algorithmns_and_concepts.algorithmns_and_concepts.prep.prep_code.abstract_classes.exceptionHandling;

public class trycatch {

    private static int divide(int a, int b){
        try {
            return a/b;
        } catch(Exception e){
            System.out.println(e);
            e.getStackTrace();

        }

            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3, 4};
        int[] arr = new int[]{47,985,0, 858};

        for(int i = 0;i<4; i++) System.out.println(trycatch.divide(arr1[i], arr[i]));

        Integer a = 1;

    }
}
