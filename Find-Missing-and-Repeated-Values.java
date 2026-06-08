1class Solution {
2    public int[] findMissingAndRepeatedValues(int[][] grid) {
3        int n = grid.length;
4
5        long N = (long) n * n;
6
7        long gridSum = 0;
8        long gridSqSum = 0;
9
10        for (int i = 0; i < n; i++) {
11            for (int j = 0; j < n; j++) {
12                gridSum += grid[i][j];
13                gridSqSum += (long) grid[i][j] * grid[i][j];
14            }
15        }
16
17        long sum = (N * (N + 1)) / 2; // Expected sum of N natural numbers
18        long sqSum = (N * (N + 1) * (2 * N + 1)) / 6; // Expected sq sum of natural numbers
19
20        long sqDiff = gridSqSum - sqSum;
21        long sumDiff = gridSum - sum;
22
23        int a = (int) ((sqDiff / sumDiff + sumDiff) / 2);
24        int b = (int) ((sqDiff / sumDiff - sumDiff) / 2);
25
26        return new int[]{a, b};
27    }
28}