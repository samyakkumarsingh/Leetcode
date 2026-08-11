class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = null;   // declare at method scope
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    arr = new int[]{i, j};
                }
            }
        }
        return arr; 
    }
}
