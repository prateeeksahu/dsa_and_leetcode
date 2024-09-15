package practice.recursionAndBacktracking;
import java.util.*;

public class printMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int m = printMax(arr, 0);
        System.out.println(m);

    }

    public static int printMax( int [] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int misa = printMax(arr, idx+1);
        if(misa > arr[idx]){
            return misa;
        } else {
            return arr[idx];
        }
    }

}
