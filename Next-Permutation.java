1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4
5        // Step 1: Find the first decreasing element from the right
6        int pivot = -1;
7        for (int i = n - 2; i >= 0; i--) {
8            if (nums[i] < nums[i + 1]) {
9                pivot = i;
10                break;
11            }
12        }
13
14        // Step 2: If a pivot exists, find the next larger element and swap
15        if (pivot != -1) {
16            int swapIndex = -1;
17            for (int j = n - 1; j > pivot; j--) {
18                if (nums[j] > nums[pivot]) {
19                    swapIndex = j;
20                    break;
21                }
22            }
23            swap(nums, pivot, swapIndex);
24        }
25        reverse(nums, pivot + 1, n - 1);
26    }
27
28    private void swap(int[] nums, int i, int j) {
29        int temp = nums[i];
30        nums[i] = nums[j];
31        nums[j] = temp;
32    }
33
34    private void reverse(int[] nums, int left, int right) {
35        while (left < right) {
36            swap(nums, left, right);
37            left++;
38            right--;
39        }
40    }
41}