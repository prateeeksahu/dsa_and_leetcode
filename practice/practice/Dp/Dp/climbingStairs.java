package practice.practice.Dp.Dp;

import java.util.Scanner;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ctab(n));
    }

    public static int count(int n, int [] qb){
            if(n == 0) return 1;
            if(n < 0) return 0;
            if(qb[n] > 0) return qb[n];

            int cp = count(n-1, qb) + count(n-2, qb) + count(n-3, qb);
            qb[n] = cp;
            return cp;
    }

    public static int ctab(int n){
        int [] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1) dp[i] = dp[i-1];
            else if (i == 2) dp[i] = dp[i-1] + dp[i-2];
            else dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
}
