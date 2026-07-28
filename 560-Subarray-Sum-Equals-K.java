class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        int[] pre = new int[nums.length];
        pre[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < pre.length; i++) {
            int required = pre[i] - k;

            cnt += map.getOrDefault(required, 0);

            map.put(pre[i], map.getOrDefault(pre[i], 0) + 1);
        }

        return cnt;
    }
}