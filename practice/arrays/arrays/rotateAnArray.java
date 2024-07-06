package practice.arrays;
import java.util.*;
public class rotateAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<arr.length ;++i ){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        rotate(arr, k);

        for(int x: arr){
            System.out.println(x);
        }
    }

    public static void reverseArray(int [] arr, int i, int j) {
        int li = i, ri = j;
        int temp = 0;

        while (li < ri) {
            temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void rotate(int [] arr, int k ){
        k = k%arr.length;
        if(k<0){
            k = k+arr.length;
        }
        reverseArray(arr, arr.length - k,arr.length - 1);
        reverseArray(arr, 0, arr.length-k-1);
        reverseArray(arr, 0, arr.length-1);

    }
}
