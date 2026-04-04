class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        for(int l=0;l<n;l++){
            for(int r=l+1;r<Math.min(n,l+k+1);r++){
                if(nums[l]==nums[r]){
                    return true;
                }
            }
        }
        return false;
    }
}