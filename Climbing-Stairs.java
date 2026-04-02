1class Solution {
2    public int climbStairs(int n) {
3        int[] dp=new int[n+1];
4      return solve(dp,n); 
5    }
6
7    public int solve (int [] dp,int n){
8        if(n<=2) return n;
9        if(dp[n]!=0) return dp[n];
10        dp[n]= solve(dp,n-1)+solve(dp,n-2);
11        return dp[n];
12         
13    }
14}