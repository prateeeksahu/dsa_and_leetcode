package practice.practice.Dp.Dp;

import java.util.*;

public class climbingStairsWithMinimmumMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];

        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        Integer [] dp = new Integer[arr.length + 1];
        dp[arr.length] = 0;

        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] > 0){
                int m = Integer.MAX_VALUE;
                for(int j = 0; j <= arr[i] && i + j < dp.length; j++) if(dp[i+j] != null) m = Math.min(m, dp[i+j]);
                if(m != Integer.MAX_VALUE) dp[i] = m+1;
            }
        }

        System.out.println(dp[0]);
    }
}
