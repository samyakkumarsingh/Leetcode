1class Solution {
2    public int uniquePaths(int m, int n){
3        int[][] dp = new int[m][n];
4        
5        for (int[] row : dp) Arrays.fill(row, -1); 
6        return solve(dp,0,0,m,n);
7    }
8
9    public int solve(int[][] dp,int i,int j,int m,int n){
10        
11        if (i>=m||j>=n) return 0; 
12        if (i==m-1&&j==n-1) return 1;
13        if (dp[i][j]!= -1) return dp[i][j];
14        
15
16        return dp[i][j] = solve(dp,i+1,j,m,n)+solve(dp,i,j+1,m,n);
17    }
18}