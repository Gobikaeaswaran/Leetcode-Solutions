// Last updated: 7/14/2026, 2:02:45 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=i;j<s.length();j++){
                int flag =0;
                for(int k=i;k<j;k++){
                    if(s.charAt(k)==s.charAt(j)){
                        flag=1;
                        break;
                    }
                }
                if(flag==1){
                    break;
                }
                c++;
            }
            if(c>max){
                max=c;
            }
        }
        return max;
    }
}