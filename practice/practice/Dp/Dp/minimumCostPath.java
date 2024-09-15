package practice.practice.Dp.Dp;

import java.util.*;
public class minimumCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[sc.nextInt()][sc.nextInt()];
        int [][] dp = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++) for(int j = 0; j < arr[0].length; j++) arr[i][j] = sc.nextInt();

        for(int i = arr.length - 1; i >= 0; i--){
            for(int j = arr[0].length-1; j >=0 ; j--){
                if(i == arr.length - 1 && j == arr[0].length-1) dp[i][j] = arr[i][j];
                else if(i == arr.length - 1) dp[i][j] = dp[i][j+1] + arr[i][j];
                else if(j == arr[0].length - 1) dp[i][j] = dp[i+1][j] + arr[i][j];
                else dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) + arr[i][j];
            }
        }

        System.out.println(dp[0][0]);
    }
}
