class Solution {
    public int[] searchRange(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                r = mid - 1;
            } 
            else if (nums[mid] > target) {
                r = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }

        int first = ans;
        l = 0;
        r = nums.length - 1;
        ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                l = mid + 1;
            } 
            else if (nums[mid] > target) {
                r = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }

        int last = ans;

        return new int[]{first, last};
    }
}