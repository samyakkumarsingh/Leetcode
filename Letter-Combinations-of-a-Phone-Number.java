1import java.util.*;
2
3class Solution {
4    List<String> result = new ArrayList<>();
5
6    public List<String> letterCombinations(String digits) {
7        if (digits.length() == 0) return result;
8
9        String[] map = {
10            "",     // 0
11            "",     // 1
12            "abc",  // 2
13            "def",  // 3
14            "ghi",  // 4
15            "jkl",  // 5
16            "mno",  // 6
17            "pqrs", // 7
18            "tuv",  // 8
19            "wxyz"  // 9
20        };
21
22        StringBuilder sb = new StringBuilder();
23        solve(digits, 0, sb, map);
24        return result;
25    }
26
27    public void solve(String digits, int i, StringBuilder sb, String[] map) {
28        if (i == digits.length()) {
29            result.add(sb.toString());
30            return;
31        }
32
33        int digit = digits.charAt(i) - '0';   // convert char → number
34        String letters = map[digit];          // letters mapped to that digit
35
36        for (int k = 0; k < letters.length(); k++) {
37            sb.append(letters.charAt(k));     // choose letter
38            solve(digits, i + 1, sb, map);    // recurse
39            sb.deleteCharAt(sb.length() - 1); // undo
40        }
41    }
42}