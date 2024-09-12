package practice.practice.Dp.Dp;

import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n, new int[n+1]));
    }

    public static int fibo(int n, int [] dp){

        if(n == 0 || n == 1) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = fibo(n-1, dp) + fibo(n-2, dp);

        return dp[n];
    }
}
