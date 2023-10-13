package practice.recursionAndBacktracking;
import java.util.Scanner;

public class firstIndexOccrance {
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

//    this is one approach
//       if(idx == arr.length-1){
//           return -1;
//       }
//
//       int fisa = index(arr, idx+1, x);
//
//       if(arr[idx] == x){
//           return idx;
//       } else {
//        return fisa;
//       }


        if(idx == arr.length){
           return -1;
       }

        if(arr[idx] == x){
            return idx;
        } else {
            int fisa = index(arr, idx+1, x);
            return fisa;
        }

    }
}
