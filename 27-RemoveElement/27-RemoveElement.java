// Last updated: 7/14/2026, 2:02:30 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
            nums[k]=nums[i];
            k++;
        }
        }
        return k;
    }
}