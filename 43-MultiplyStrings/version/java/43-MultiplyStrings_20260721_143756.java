// Last updated: 7/21/2026, 2:37:56 PM
1class Solution {
2    public String multiply(String num1, String num2) {
3        if(num1.equals("0")||num2.equals("0")){
4            return "0";
5        }
6        int n1=num1.length();
7        int n2=num2.length();
8        int result[]=new int[n1+n2];
9        for(int i=n1-1;i>=0;i--){
10            for(int j=n2-1;j>=0;j--){
11               int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
12                int sum = mul + result[i + j + 1];
13                result[i + j + 1] = sum % 10;
14                result[i + j] += sum / 10;
15            }
16        }
17        StringBuilder ans = new StringBuilder();
18        for (int num : result) {
19            if (!(ans.length() == 0 && num == 0)) {
20                ans.append(num);
21            }
22        }
23        return ans.toString();
24    }
25}