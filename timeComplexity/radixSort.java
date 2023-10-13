package practice.timeComplexity;

import java.util.*;

public class radixSort {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
    public static void radixSort(int[] arr) {
        // write code here

        int max = Integer.MIN_VALUE;

        for(int val : arr){
            if(val>max){
                max = val;
            }
        }

        int exp = 1;
        while(exp<=max){
            countSort(arr, exp);
            exp*=10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        int farr[] = new int[10];

        for(int i = 0; i<arr.length; i++){
            int val = arr[i];
            farr[val / exp % 10]++;
        }

        for(int i = 1; i<farr.length;i++){
            farr[i] = farr[i] + farr[i-1];
        }

        int [] ans = new int[arr.length];


        for(int i = 0; i<arr.length;i++){
            int val = arr[i];
            int pos = farr[val / exp % 10];
            int idx = pos-1;
            ans[idx] = val;
            farr[val / exp % 10]--;

        }

        for(int i = 0;i<arr.length;i++){
            arr[i] = ans[i];
        }

        System.out.print("After sorting on " + exp + " place -> ");
        print(ans);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



}