1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4
5        // Step 1: Transpose
6        for (int i = 0; i < n; i++) {
7            for (int j = i; j < n; j++) {
8                swap(matrix, i, j, j, i);
9            }
10        }
11
12        // Step 2: Reverse every row
13        for (int i = 0; i < n; i++) {
14            reverse(matrix[i]);
15        }
16    }
17
18    private void swap(int[][] matrix, int r1, int c1,int r2, int c2) {
19
20        int temp = matrix[r1][c1];
21        matrix[r1][c1] = matrix[r2][c2];
22        matrix[r2][c2] = temp;
23    }
24
25    private void reverse(int[] row) {
26        int left = 0;
27        int right = row.length - 1;
28
29        while (left < right) {
30            int temp = row[left];
31            row[left] = row[right];
32            row[right] = temp;
33
34            left++;
35            right--;
36        }
37    }
38}