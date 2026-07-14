// Last updated: 7/14/2026, 2:01:44 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int ls=0;
        for(int k=0;k<n;k++){
            int rs=total-ls-nums[k];
            if(ls==rs){
                return k;
            }
            ls=ls+nums[k];
        }
        return -1;
    }
}