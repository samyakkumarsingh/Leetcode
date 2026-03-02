class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        int res=1;
        while(j<nums.length){
            if(nums[j]==nums[i]){
            j++;
            continue;
            }
            
                nums[i+1]=nums[j];
                j++;
                i++;
                res++;
            
        }
        return res;
    }
}