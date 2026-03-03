1import java.util.*;
2
3class Solution {
4    
5    private static final String[] map = {
6        "",     // 0
7        "",     // 1
8        "abc",  // 2
9        "def",  // 3
10        "ghi",  // 4
11        "jkl",  // 5
12        "mno",  // 6
13        "pqrs", // 7
14        "tuv",  // 8
15        "wxyz"  // 9
16    };
17    
18    public List<String> letterCombinations(String digits) {
19        List<String> result = new ArrayList<>();
20        
21        if (digits == null || digits.length() == 0)
22            return result;
23        
24        backtrack(digits, 0, new StringBuilder(), result);
25        return result;
26    }
27    
28    private void backtrack(String digits, int index, 
29                           StringBuilder current, 
30                           List<String> result) {
31        
32        if (index == digits.length()) {
33            result.add(current.toString());
34            return;
35        }
36        
37        String letters = map[digits.charAt(index) - '0'];
38        
39        for (char ch : letters.toCharArray()) {
40            current.append(ch);
41            backtrack(digits, index + 1, current, result);
42            current.deleteCharAt(current.length() - 1); // backtrack
43        }
44    }
45}