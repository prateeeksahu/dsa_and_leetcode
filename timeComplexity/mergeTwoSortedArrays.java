package practice.timeComplexity;

import java.util.Scanner;
public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for(int i = 0;i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i = 0;i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int [] mergedArray = merge(arr1, arr2);
        print(mergedArray);
    }

    public static int[] merge(int [] arr1, int[] arr2){
        int [] res = new int[arr1.length+arr2.length];
        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i]<arr2[j]){
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length){
            res[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){
            res[k] = arr2[j];
            j++;
            k++;
        }


        return res;
    }

    public static void print(int [] mergedArray){
        for(int i = 0;i < mergedArray.length; i++){
            System.out.println(mergedArray[i]);
        }
    }

}
