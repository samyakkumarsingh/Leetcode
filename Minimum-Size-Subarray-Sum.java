1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int sum=0;
4        int low=0;
5        int high=0;
6        int result=Integer.MAX_VALUE;
7
8        while(high<nums.length){
9            sum=sum+nums[high];
10            while(sum>=target){
11                int len=high-low+1;
12                result=Math.min(result,len);
13                sum=sum-nums[low];
14                low++;
15            }
16            high++;
17        }
18        return result == Integer.MAX_VALUE ? 0 : result;
19    }
20}