1import java.util.*;
2
3class Solution {
4    int n;
5    HashMap<Integer, Integer> mp = new HashMap<>();
6    int[][] t = new int[2001][2001];
7
8    public boolean solve(int[] stones, int currIndex, int prevJump) {
9        if (currIndex == n - 1) {
10            return true;
11        }
12
13        if (t[currIndex][prevJump] != -1) {
14            return t[currIndex][prevJump] == 1;
15        }
16
17        boolean result = false;
18
19        for (int nextJump = prevJump - 1; nextJump <= prevJump + 1; nextJump++) {
20            if (nextJump > 0) {
21                int nextStone = stones[currIndex] + nextJump;
22
23                if (mp.containsKey(nextStone)) {
24                    result = result || solve(stones, mp.get(nextStone), nextJump);
25                }
26            }
27        }
28
29        t[currIndex][prevJump] = result ? 1 : 0;
30        return result;
31    }
32
33    public boolean canCross(int[] stones) {
34        if (stones[1] != 1) {
35            return false;
36        }
37
38        n = stones.length;
39
40        for (int i = 0; i < n; i++) {
41            mp.put(stones[i], i);
42        }
43
44        for (int[] row : t) {
45            Arrays.fill(row, -1);
46        }
47
48        return solve(stones, 0, 0);
49    }
50}