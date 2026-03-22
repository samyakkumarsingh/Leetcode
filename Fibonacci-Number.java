1class Solution {
2   
3    public int fib(int n) {
4         int [] dp=new int[n+1];
5         for(int i = 0; i <= n; i++) {
6            dp[i] = -1;
7        }
8
9        return solve(n,dp);
10    }
11    public int solve(int n,int [] dp){
12        if(n<=1)
13        return n;
14
15        if(dp[n]!=-1)
16        return dp[n];
17
18        dp[n]=solve(n-1,dp)+solve(n-2,dp);
19
20        return dp[n];
21    }
22}