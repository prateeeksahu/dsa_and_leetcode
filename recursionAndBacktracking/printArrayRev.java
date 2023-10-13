package practice.recursionAndBacktracking;
import java.util.*;

public class printArrayRev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        printRev(arr, 0);
    }

    public static void printRev(int [] arr,int idx){
        if(idx == arr.length){
            return;
        }

        printRev(arr, idx+1);
        System.out.println(arr[idx]);
    }
}

