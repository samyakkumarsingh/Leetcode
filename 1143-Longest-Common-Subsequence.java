class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] x=text1.toCharArray();
        char[] y=text2.toCharArray();
        int n=x.length;
        int m=y.length;
        int[][] dp=new int[n+1][m+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(x,y,n,m,dp);
        
    }

    public int solve(char[] x,char[] y,int n,int m,int[][] dp){
        if(n==0||m==0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(x[n-1]==y[m-1]) return dp[n][m]=1+solve(x,y,n-1,m-1,dp);
        return dp[n][m]=Math.max(solve(x,y,n-1,m,dp),solve(x,y,n,m-1,dp));
    }
}