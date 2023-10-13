package practice.timeComplexity;

import java.util.*;

public class findPivot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(find(arr));
    }

    public static int find(int [] arr){
        int hi = arr.length-1;
        int lo = 0;

        while(lo<hi){
            int mid = lo+hi/2;
            if(arr[mid] < arr[hi]){
                hi = mid;
            } else {
                lo = mid;
            }
        }

        return arr[hi];
    }
}
