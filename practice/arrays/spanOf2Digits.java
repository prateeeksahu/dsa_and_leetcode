package practice.arrays;
import java.util.*;

public class spanOf2Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i< arr.length;++i){
            arr[i] = sc.nextInt();
        }

        int d = span(arr);
        System.out.println(d);
    }
    public static int span(int[] arr){
        int min, max, rv = 0;
        min = max = arr[0];

        for(int i=1;i<arr.length;++i){
            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }

            rv = max-min;

        }
        return rv;
    }
}
