// Last updated: 8/4/2026, 12:15:18 PM
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3      int ones=0;
4      int flips =0;
5      for(int i=0;i<s.length();i++){
6        if(s.charAt(i)=='1'){
7            ones++;
8        }
9        else{
10            flips=Math.min(flips+1,ones);
11        }
12      }  
13      return flips;
14    }
15}