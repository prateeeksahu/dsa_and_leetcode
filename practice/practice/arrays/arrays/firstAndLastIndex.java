package practice.arrays;
import java.util.*;
public class firstAndLastIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();

        int lo = 0;
        int hi = arr.length-1;
        int fi = -1;

        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(d<arr[mid]){
                lo = mid-1;
            } else if(d>arr[mid]) {
                hi = mid + 1;
            } else {
                fi = mid;
                hi = mid+1;
            }
        }
        System.out.println(fi);

//        int x = fi;
//
//        while(arr[x]==d){
//            x--;
//        }
//
//        System.out.println(x);
    }
}
