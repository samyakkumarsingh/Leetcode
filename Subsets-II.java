1class Solution {
2    List<List<Integer>> result = new ArrayList<>();
3
4    public List<List<Integer>> subsetsWithDup(int[] nums) {
5        Arrays.sort(nums);
6        List<Integer> temp=new ArrayList<>();
7        solve(0,nums,new ArrayList<>());
8        return result;
9    }
10
11    private void solve(int start, int[] nums, List<Integer> current) {
12        result.add(new ArrayList<>(current));    // store current subset
13
14        for (int i = start; i < nums.length; i++) {
15
16            if (i > start && nums[i] == nums[i - 1]) 
17                continue;                        // skip duplicates at same level
18
19            current.add(nums[i]);                // include element
20            solve(i + 1, nums, current);         // recurse
21            current.remove(current.size() - 1);  // undo (backtrack)
22        }
23    }
24}