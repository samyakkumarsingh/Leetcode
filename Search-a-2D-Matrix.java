1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int start = 0;
7        int end = m * n - 1;
8
9        while (start <= end) {
10            int mid = start + (end - start) / 2;
11
12            int row = mid / n;
13            int col = mid % n;
14
15            if (matrix[row][col] > target) {
16                end = mid - 1;
17            } else if (matrix[row][col] < target) {
18                start = mid + 1;
19            } else {
20                return true;
21            }
22        }
23
24        return false;
25    }
26}