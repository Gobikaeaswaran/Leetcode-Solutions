// Last updated: 9/8/2026, 11:42:46 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left =0;
4        int sum=0;
5        int min=nums.length+1;
6        for(int r=0;r<nums.length;r++){
7            sum+=nums[r];
8            while(sum>=target){
9                int length=r-left+1;
10                if(length<min){
11                    min=length;
12                }
13                sum-=nums[left];
14                left++;
15            }
16        }
17        if(min==nums.length+1){
18            return 0;
19        }
20        return min;
21    }
22}