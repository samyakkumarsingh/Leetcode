import java.util.*;

class Solution {
    HashMap<Integer, Integer> mp = new HashMap<>();
    int[][] t = new int[2001][2001];
    int n;

    boolean solve(int[] stones, int i, int prevJump) {
        if (i == n - 1) return true;

        if (t[i][prevJump] != -1)
            return t[i][prevJump] == 1;

        for (int jump = prevJump - 1; jump <= prevJump + 1; jump++) {
            if (jump > 0) {
                int next = stones[i] + jump;

                if (mp.containsKey(next)) {
                    if (solve(stones, mp.get(next), jump)) {
                        t[i][prevJump] = 1;
                        return true;
                    }
                }
            }
        }

        t[i][prevJump] = 0;
        return false;
    }

    public boolean canCross(int[] stones) {
        n = stones.length;

        if (stones[1] != 1) return false;

        for (int i = 0; i < n; i++) {
            mp.put(stones[i], i);
        }

        for (int i = 0; i < 2001; i++) {
            Arrays.fill(t[i], -1);
        }

        return solve(stones, 0, 0);
    }
}