package practice.recursionAndBacktracking;
import java.util.*;

public class targetSumSubset {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        print(arr, 0, "", 0, tar);
    }

    public static void print(int arr [], int idx, String set, int sos, int tar){

        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set);
            }
            return;
        }

        print(arr, idx +1, set+arr[idx] + " ", sos+ arr[idx], tar);
        print(arr, idx +1, set, sos, tar);




    }
}
