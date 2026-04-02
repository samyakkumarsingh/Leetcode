1class Solution {
2    public int uniquePaths(int m, int n) {
3        return solve(0, 0, m, n);
4    }
5
6    public int solve(int i, int j, int m, int n) {
7        if(i>=m||j>=n) return 0;
8        if(i==m-1&&j==n-1) return 1;
9        return solve(i+1,j,m,n)+solve(i,j+1,m,n);
10    }
11}