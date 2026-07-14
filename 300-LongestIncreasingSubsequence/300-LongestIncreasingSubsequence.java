// Last updated: 7/14/2026, 2:01:50 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
      int []d=new int [n];
      int max=1;
      for(int i=0;i<n;i++){
        d[i]=1;
      } 
      for(int j=1;j<n;j++){
        for(int k=0;k<j;k++){
            if(nums[j]>nums[k]){
                d[j]=Math.max(d[j],d[k]+1);
            }
        }
        max=Math.max(max,d[j]);
        }
        return max; 
    }
}