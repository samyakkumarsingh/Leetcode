class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        solve(0, nums, new ArrayList<>());
        return result;
    }

    public void solve(int i, int[] nums, List<Integer> temp) {
        if (i == nums.length) {
            result.add(new ArrayList<>(temp)); // copy
            return;
        }

        // Include current element
        temp.add(nums[i]);
        solve(i + 1, nums, temp);

        // Undo (backtrack)
        temp.remove(temp.size() - 1);

        // Exclude current element
        solve(i + 1, nums, temp);
    }
}