class Solution {

    public boolean possible(int[] bloomDay,int mid,int m,int k){
        int bouquet=0;
        int curr=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                curr++;
            }
            else curr=0;
            if(curr==k){
                bouquet++;
                curr=0;
            }
        }
        if(bouquet>=m) return true;
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low=1;
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        if(m*k>n) return -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}