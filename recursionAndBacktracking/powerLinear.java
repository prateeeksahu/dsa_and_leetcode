package practice.recursionAndBacktracking;
import java.util.*;

public class powerLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int x = power(n, p);
        System.out.println(x);
    }

    public static int power(int n, int p){
        if(p==0){
            return 1;
        }
//        int npm1 = power(n, p-1);
//        int np = n * npm1;

        int xpnb2 = power(n, n/2);
        int np = xpnb2 * xpnb2;

        if(n%2==1){
            np*=n;
        }

        return np;

    }
}
