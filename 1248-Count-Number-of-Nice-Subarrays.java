class Solution {
    int[] arr;
    public int numberOfSubarrays(int[] nums, int k) {
        arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                arr[i]=1;
            }
            else arr[i]=0;
        }
        return subarraySum(arr,k);
    }

    public int subarraySum(int[] arr, int k) {
        int cnt = 0;
        int[] pre = new int[arr.length];
        pre[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i - 1] + arr[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < pre.length; i++) {
            int required = pre[i] - k;

            cnt += map.getOrDefault(required, 0);

            map.put(pre[i], map.getOrDefault(pre[i], 0) + 1);
        }

        return cnt;
    }
}