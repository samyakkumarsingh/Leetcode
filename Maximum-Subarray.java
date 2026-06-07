1class Solution {
2    public int maxSubArray(int[] nums) {
3        int maxsum=nums[0];
4        int sum=nums[0];
5        for(int i=1;i<nums.length;i++){
6            if(sum>=0){
7                sum=sum+nums[i];
8            }
9            else 
10            sum=nums[i];
11            maxsum=Math.max(sum,maxsum);
12        }
13        return maxsum;
14    }
15}