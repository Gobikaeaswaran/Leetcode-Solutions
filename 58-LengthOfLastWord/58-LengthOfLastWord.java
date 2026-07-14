// Last updated: 7/14/2026, 2:02:20 PM
class Solution {
    public int lengthOfLastWord(String s) {
       String word[]=s.split(" ");
        return word[word.length-1].length();
    }
}