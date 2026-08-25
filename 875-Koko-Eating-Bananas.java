class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }

    public boolean possible(int mid,int[] piles, int h){
        long hours = 0;
        for (int pile : piles) {
            hours += pile / mid;
            if (pile % mid != 0) hours++;
        }
        return hours <= h;
    }
    
}