// Last updated: 8/5/2026, 2:56:46 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3       for(int i=0;i<numbers.length;i++){
4        for(int j=i+1;j<numbers.length;j++){
5            if(numbers[i]+numbers[j]==target){
6                return new int[]{i+1,j+1};
7            }
8        }
9       }
10        return new int[]{};
11    }
12}