class Solution {
    public int minimumDifference(int[] nums) {
        int n = nums.length / 2;

        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        List<Long>[] left = new ArrayList[n + 1];
        List<Long>[] right = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            left[i] = new ArrayList<>();
            right[i] = new ArrayList<>();
        }

        generate(nums, 0, n, 0, 0, left);
        generate(nums, n, 2 * n, 0, 0, right);

        for (int i = 0; i <= n; i++) {
            Collections.sort(right[i]);
        }

        long minDiff = Long.MAX_VALUE;

        for (int leftCount = 0; leftCount <= n; leftCount++) {
            int rightCount = n - leftCount;

            for (long leftSum : left[leftCount]) {
                long target = totalSum / 2 - leftSum;

                List<Long> list = right[rightCount];

                int index = Collections.binarySearch(list, target);

                if (index < 0) {
                    index = -index - 1;
                }

                // Check the closest value at index
                if (index < list.size()) {
                    long selectedSum = leftSum + list.get(index);
                    minDiff = Math.min(
                        minDiff,
                        Math.abs(totalSum - 2 * selectedSum)
                    );
                }

                // Check the previous value
                if (index > 0) {
                    long selectedSum = leftSum + list.get(index - 1);
                    minDiff = Math.min(
                        minDiff,
                        Math.abs(totalSum - 2 * selectedSum)
                    );
                }
            }
        }

        return (int) minDiff;
    }

    private void generate(
        int[] nums,
        int start,
        int end,
        int count,
        long sum,
        List<Long>[] result
    ) {
        if (start == end) {
            result[count].add(sum);
            return;
        }

        // Don't take current element
        generate(nums, start + 1, end, count, sum, result);

        // Take current element
        generate(nums, start + 1, end, count + 1,
                 sum + nums[start], result);
    }
}