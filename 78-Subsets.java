class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        solve(nums, 0, new ArrayList<>());
        return result;
    }

    public void solve(int[] nums, int start, List<Integer> temp) {

        // Base case: all elements have been considered
        if (start == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // Include current element
        temp.add(nums[start]);
        solve(nums, start + 1, temp);

        // ❌ Your mistake:
        // temp.remove(nums[nums.length]);
        //
        // nums[nums.length] is OUT OF BOUNDS because the last valid index is nums.length - 1.
        // Also, you should remove the LAST ADDED ELEMENT, not an element from nums.
        temp.remove(temp.size() - 1);

        // Exclude current element
        solve(nums, start + 1, temp);
    }
}