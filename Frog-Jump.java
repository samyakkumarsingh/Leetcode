1import java.util.*;
2
3class Solution {
4    HashMap<Integer, Integer> mp = new HashMap<>();
5    int[][] t = new int[2001][2001];
6    int n;
7
8    boolean solve(int[] stones, int i, int prevJump) {
9        if (i == n - 1) return true;
10
11        if (t[i][prevJump] != -1)
12            return t[i][prevJump] == 1;
13
14        for (int jump = prevJump - 1; jump <= prevJump + 1; jump++) {
15            if (jump > 0) {
16                int next = stones[i] + jump;
17
18                if (mp.containsKey(next)) {
19                    if (solve(stones, mp.get(next), jump)) {
20                        t[i][prevJump] = 1;
21                        return true;
22                    }
23                }
24            }
25        }
26
27        t[i][prevJump] = 0;
28        return false;
29    }
30
31    public boolean canCross(int[] stones) {
32        n = stones.length;
33
34        if (stones[1] != 1) return false;
35
36        for (int i = 0; i < n; i++) {
37            mp.put(stones[i], i);
38        }
39
40        for (int i = 0; i < 2001; i++) {
41            Arrays.fill(t[i], -1);
42        }
43
44        return solve(stones, 0, 0);
45    }
46}