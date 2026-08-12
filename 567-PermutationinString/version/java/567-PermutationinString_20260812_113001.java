// Last updated: 8/12/2026, 11:30:01 AM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3       if(s1.length()>s2.length()){
4        return false;
5       }
6       int []a=new int[26];
7       int b[]=new int[26];
8       for(int i=0;i<s1.length();i++){
9        a[s1.charAt(i)-'a']++;
10        b[s2.charAt(i)-'a']++;
11       }
12       for(int i=s1.length();i<s2.length();i++){
13        if(Arrays.equals(a,b)){
14            return true;
15        }
16        b[s2.charAt(i)-'a']++;
17        b[s2.charAt(i-s1.length())-'a']--;
18       }
19       return Arrays.equals(a,b);
20    }
21}