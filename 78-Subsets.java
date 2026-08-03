class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        solve(nums, 0, new ArrayList<>());
        return result;
    }

    public void solve(int[] nums, int start, List<Integer> temp) {

        if (start == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[start]);
        solve(nums, start + 1, temp);
        temp.remove(temp.size() - 1);
        solve(nums, start + 1, temp);
    }
}