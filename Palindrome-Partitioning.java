1import java.util.*;
2
3class Solution {
4    List<List<String>> result = new ArrayList<>();
5
6    public List<List<String>> partition(String s) {
7        List<String> current = new ArrayList<>();
8        solve(s, 0, current);
9        return result;
10    }
11
12    public void solve(String s, int idx, List<String> current) {
13        if (idx == s.length()) {
14            result.add(new ArrayList<>(current));
15            return;
16        }
17
18        for (int i = idx; i < s.length(); i++) {
19            if (isPalindrome(s, idx, i)) {
20                current.add(s.substring(idx, i + 1));
21                solve(s, i + 1, current);
22                current.remove(current.size() - 1);
23            }
24        }
25    }
26
27    public boolean isPalindrome(String s, int left, int right) {
28        while (left < right) {
29            if (s.charAt(left) != s.charAt(right)) {
30                return false;
31            }
32            left++;
33            right--;
34        }
35        return true;
36    }
37}