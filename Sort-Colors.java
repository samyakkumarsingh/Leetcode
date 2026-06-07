1class Solution {
2    public void sortColors(int[] nums) {
3        int i = 0;
4        int j = 0;
5        int k = nums.length - 1;
6
7        while (j <= k) {
8            if (nums[j] == 1) {
9                j++;
10            } 
11            else if (nums[j] == 2) {
12                swap(nums, j, k);
13                k--;
14            } 
15            else { // nums[j] == 0
16                swap(nums, i, j);
17                i++;
18                j++;
19            }
20        }
21    }
22
23    public void swap(int[] nums, int i, int j) {
24        int temp = nums[i];
25        nums[i] = nums[j];
26        nums[j] = temp;
27    }
28}