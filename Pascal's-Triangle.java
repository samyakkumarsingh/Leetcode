1import java.util.*;
2
3// Class containing Pascal's Triangle generation logic
4class Solution {
5    // Function to generate Pascal's Triangle up to numRows
6    public List<List<Integer>> generate(int numRows) {
7        // Result list to hold all rows
8        List<List<Integer>> triangle = new ArrayList<>();
9
10        // Loop for each row
11        for (int i = 0; i < numRows; i++) {
12            // Create a row with size (i+1)
13            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
14
15            // Fill elements from index 1 to i-1 (middle values)
16            for (int j = 1; j < i; j++) {
17                // Each element = sum of two elements above it
18                row.set(j, triangle.get(i - 1).get(j - 1) +
19                           triangle.get(i - 1).get(j));
20            }
21
22            // Add current row to the triangle
23            triangle.add(row);
24        }
25        return triangle;
26    }
27}
28
29