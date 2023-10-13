package practice.arrays;
import java.util.*;

public class printAllSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        printSubArray(arr);
    }

    public static void printSubArray(int [] arr){
        int x = 0;
        for(int i = 0; i < arr.length ; ++i){
            for(int j = i; j<arr.length;++j){
                for( int k = i ; k <= j ; ++k){
                    System.out.print(arr[k]+ "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
