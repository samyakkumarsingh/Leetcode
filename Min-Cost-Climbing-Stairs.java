1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n = cost.length;
4        int[] dp = new int[n + 1];
5
6        dp[0] = 0;
7        dp[1] = 0;
8
9        for (int i = 2; i <= n; i++) {
10            dp[i] = Math.min(
11                dp[i - 1] + cost[i - 1],
12                dp[i - 2] + cost[i - 2]
13            );
14        }
15
16        return dp[n];
17    }
18}