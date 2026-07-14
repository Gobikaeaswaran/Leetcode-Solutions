// Last updated: 7/14/2026, 2:01:53 PM
class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()){
            return false;
        }
        int c[]=new int[256];
        for(int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for(int nums:c){
            if(nums!=0){
                return false;
            }
        }
        return true;
    }
}