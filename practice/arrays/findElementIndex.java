package practice.arrays;
import java.util.*;

public class findElementIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i = 0; i < arr.length;++i){
            arr[i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int ind= -1;

        for(int i = 0; i < arr.length;++i){
            if(arr[i]==d){
                ind = i;
            }
        }
        System.out.println(ind);
    }
}
