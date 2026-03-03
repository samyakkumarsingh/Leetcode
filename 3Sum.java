1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6        
7        Arrays.sort(nums);   // Step 1: Sort
8        
9        for (int i = 0; i < nums.length - 2; i++) {
10            
11            // Skip duplicate first elements
12            if (i > 0 && nums[i] == nums[i - 1]) continue;
13            
14            int left = i + 1;
15            int right = nums.length - 1;
16            
17            while (left < right) {
18                int sum = nums[i] + nums[left] + nums[right];
19                
20                if (sum == 0) {
21                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
22                    
23                    // Skip duplicates for left
24                    while (left < right && nums[left] == nums[left + 1]) left++;
25                    
26                    // Skip duplicates for right
27                    while (left < right && nums[right] == nums[right - 1]) right--;
28                    
29                    left++;
30                    right--;
31                }
32                else if (sum < 0) {
33                    left++;
34                }
35                else {
36                    right--;
37                }
38            }
39        }
40        
41        return result;
42    }
43}