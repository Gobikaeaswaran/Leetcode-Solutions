// Last updated: 8/7/2026, 11:49:05 AM
1class Solution {
2    public boolean isValidSerialization(String preorder) {
3        String []arr=preorder.split(",");
4        int slots=1;
5        for(String s:arr){
6            slots--;
7            if(slots<0){
8                return false;
9            }
10            if(!s.equals("#")){
11                slots+=2;
12            }
13        }
14        return slots==0;
15    }
16}