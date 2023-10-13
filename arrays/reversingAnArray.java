package practice.arrays;
import java.util.*;
public class reversingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<arr.length ;++i ){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        for(int x: arr){
            System.out.println(x);
        }
    }

    public static void reverseArray(int [] arr){
        int i = 0, j = arr.length-1;
        int temp = 0;

        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }
}
