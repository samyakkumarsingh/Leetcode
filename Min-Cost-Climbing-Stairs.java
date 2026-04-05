1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        Integer[] dp = new Integer[cost.length];
4        return Math.min(solve(cost, 0, dp), solve(cost, 1, dp));
5    }
6
7    public int solve(int[] cost, int i, Integer[] dp) {
8        if (i >= cost.length)
9            return 0;
10
11        if (dp[i] != null)
12            return dp[i];
13
14        int oneStep = cost[i] + solve(cost, i + 1, dp);
15        int twoStep = cost[i] + solve(cost, i + 2, dp);
16
17        return dp[i] = Math.min(oneStep, twoStep);
18    }
19}