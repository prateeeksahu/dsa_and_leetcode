package practice.recursionAndBacktracking;
import java.util.*;

public class lastIndexOfEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int m = index(arr, 0, x);
        System.out.println(m);
    }

    public static int index(int [] arr, int idx, int x){
        if(idx == arr.length) {
        return -1;
        }
        int liisa = index(arr, idx+1, x);

        if(liisa == -1){
            if(arr[idx]==x){
                return idx;
            } else {
                return -1;
            }
        }else {
            return liisa;
        }

    }
}
