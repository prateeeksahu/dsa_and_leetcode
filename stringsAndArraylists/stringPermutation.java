package practice.stringsAndArraylists;
import java.util.*;

public class stringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        permutation(str);
    }

    public static void permutation(String str){
//        StringBuilder sb = new StringBuilder(str);
        int n = str.length();
        int f = fact(n);

        for(int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int t = i;
            for(int div = n;div>=1; div--){
                int q = t/div;
                int r = t%div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                t=q;
            }
            System.out.println();
        }


    }

    public static int fact(int num){
        int x = 1;

        for(int i = 1; i<=num; i++){
            x*=i;
        }

        return x;
    }
}
