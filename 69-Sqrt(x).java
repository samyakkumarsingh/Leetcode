class Solution {
    public boolean subprob(long mid,int x){
        if(mid*mid<=x) return true;
        else return false;
    }
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        int ans=x;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(subprob(mid,x)==true){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}