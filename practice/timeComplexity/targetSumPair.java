package practice.timeComplexity;
import java.util.*;

public class targetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int tar = sc.nextInt();
        sum(arr, tar);
    }

    public static void sum(int [] arr, int tar){
        Arrays.sort(arr);
        int li = 0;
        int ri = arr.length-1;

        while(li<ri){

            if(arr[li] + arr[ri] > tar){
                ri--;
            } else if (arr[ri] + arr[li] < tar) {
                li++;
            } else{
                System.out.println(arr[li] + " " + arr[ri]);
                li++;
                ri--;
            }
        }
    }
}
