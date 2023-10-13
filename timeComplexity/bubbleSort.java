package practice.timeComplexity;

import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);
    }

    public static void sort(int [] arr){
        for(int i = 1; i <= arr.length; i++){
            for(int j = 0; j < arr.length - i; j++){
                if(isSmall(arr, j+1, j)){
                    swap(arr,j+1,j);
                }
            }
        }
        print(arr);
    }

    public static void swap (int []  arr, int i, int j){
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSmall(int [] arr, int i, int j){
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if(arr[j]>arr[i]){
            return true;
        } else {
            return false;
        }
    }

    public static void print(int [] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
