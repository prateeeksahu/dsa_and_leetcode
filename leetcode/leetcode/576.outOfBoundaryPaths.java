// class Solution {
//  public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
//         final int M = 1000000000 + 7;
//         int[][] dp = new int[m][n];
//         dp[x][y] = 1;
//         int count = 0;

//         for (int moves = 1; moves <= N; moves++) {
//             int[][] temp = new int[m][n];

//             for (int i = 0; i < m; i++) {
//                 for (int j = 0; j < n; j++) {
//                     if (i == m - 1) count = (count + dp[i][j]) % M;
//                     if (j == n - 1) count = (count + dp[i][j]) % M;
//                     if (i == 0) count = (count + dp[i][j]) % M;
//                     if (j == 0) count = (count + dp[i][j]) % M;
//                     temp[i][j] = (
//                             ((i > 0 ? dp[i - 1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % M +
//                             ((j > 0 ? dp[i][j - 1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % M
//                     ) % M;
//                 }
//             }
//             dp = temp;
//         }

//         return count;
//     }
// }



class Solution {

    int M = 1000000000 + 7;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int [][][] dp = new int[m][n][maxMove + 1];

        for(int [][] x : dp){
            for(int [] y : x){
                Arrays.fill(y,-1);
            }
        }

        return paths(m, n, maxMove, startRow, startColumn, dp);

    }

    public int paths(int m, int n, int ml, int sr, int sc, int [][][] dp){
        if(sr == m || sc == n || sr<0 || sc<0) return 1;
        if(ml == 0) return 0;

        if(dp[sr][sc][ml]>=0) return dp[sr][sc][ml];

        dp[sr][sc][ml] = (
            (paths(m, n, ml - 1, sr + 1, sc, dp) + paths(m, n, ml - 1, sr - 1, sc, dp)) % M + 
            (paths(m, n, ml - 1, sr, sc + 1, dp) + paths(m, n, ml - 1, sr,sc - 1 , dp)) % M
        ) % M;

        return dp[sr][sc][ml];
    }
}
