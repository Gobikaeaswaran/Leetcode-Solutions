// Last updated: 7/14/2026, 2:02:43 PM
class Solution {
    public String convert(String s, int numRows) {
       if (numRows == 1) 
       return s;
        String result = "";
        int n = s.length();
        int step = 2 * (numRows - 1);
        for (int row = 0; row < numRows; row++) {
            for (int i = row; i < n; i += step) {
                result = result + s.charAt(i);
                int second = i + step - 2 * row;
                if (row != 0 && row != numRows - 1 && second < n) {
                    result = result + s.charAt(second);
                }
            }
        }
        return result;
    }
}