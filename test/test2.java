

package practice.test;
import java.util.*;

public class test2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();
        while (t > 0) {
            System.out.println(solve());
            t--;
        }
    }

    public static int solve() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        while(n>=0){
            int r = n % x;
            if(r>=y){
                int d = r-y;
                return n-d;
            } else {
                n = n - (r + 1);
                r = n % x;
            }
        }

        return 0;
    }
}

