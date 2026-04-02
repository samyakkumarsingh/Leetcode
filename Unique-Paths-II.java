1class Solution{
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5        if(obstacleGrid[0][0] == 1) return 0;
6
7        int[][] dp = new int[m][n];  
8        for (int[] row:dp) Arrays.fill(row,-1); 
9        
10        return solve(dp,0,0,m,n,obstacleGrid);
11    }
12
13    public int solve(int[][] dp,int i, int j, int m, int n, int[][] grid) {
14        if(i>=m||j>=n) return 0;
15        if(grid[i][j]==1) return 0;
16        if(i==m-1&&j==n-1) return 1;
17        if (dp[i][j]!= -1) return dp[i][j];
18        return dp[i][j]=solve(dp,i+1,j,m,n,grid)+solve(dp,i,j+1,m,n,grid);
19    }
20}