package practice.arrays;
import java.util.*;
public class inverseOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        inverse(arr);
    }

    public static void inverse(int [] arr){
        int [] inv = new int [arr.length];

        for(int i=0;i<arr.length;i++){
            int v = arr[i];
            inv[v] = i;
        }
    }
}
