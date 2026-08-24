// Last updated: 8/24/2026, 11:35:48 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int i=0;i<nums.length;i++){
5            set.add(nums[i]);
6        }
7        int max=0;
8        for(int num:set){
9            if(!set.contains(num-1)){
10                int count=1;
11                int current =num;
12                while(set.contains(current+1)){
13                    current++;
14                    count++;
15                }
16                if(count>max){
17                    max=count;
18                }
19            }
20        }
21        return max;
22    }
23}