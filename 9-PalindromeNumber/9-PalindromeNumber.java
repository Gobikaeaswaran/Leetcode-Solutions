// Last updated: 7/14/2026, 2:02:39 PM
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
    int cpy=x;
        while(x>0){
            int y=x%10;
            rev =rev*10+y;
            x=x/10;
            
        }
        if(rev==cpy){
            return true;
        }
        return false;
    }
}