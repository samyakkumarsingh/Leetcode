class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int prefix = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            prefix += num % 2;

            int required = prefix - k;

            count += map.getOrDefault(required, 0);

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}