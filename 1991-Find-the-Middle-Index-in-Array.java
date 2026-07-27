class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] pre = new int[nums.length];

        pre[0] = nums[0];

        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }

        for (int i = 0; i < pre.length; i++) {
            int leftSum = (i == 0) ? 0 : pre[i - 1];
            int rightSum = pre[pre.length - 1] - pre[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}