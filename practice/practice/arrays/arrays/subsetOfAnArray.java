package practice.arrays;
import java.util.*;
public class subsetOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        subset(arr);
    }

    public static void subset(int [] arr){
        int lim = (int)Math.pow(2,arr.length);
        for(int i = 0; i<lim;++i){
            String set = "";
            int it = i;

            for(int j = arr.length-1; j>=0; j--){
                int r = it % 10;
                it/=2;

                if (r==0){
                    set+="-\t";
                } else {
                    set+=arr[j]+"\t";
                }
            }
            System.out.println(set);
        }
    }
}
