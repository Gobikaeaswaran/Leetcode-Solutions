// Last updated: 7/21/2026, 2:59:41 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n=word1.length();
4        int m=word2.length();
5        int a[][]=new int[n+1][m+1];
6        for(int i=1;i<=n;i++){
7            for(int j=1;j<=m;j++){
8                if(word1.charAt(i-1)==word2.charAt(j-1)){
9                    a[i][j]=a[i-1][j-1]+1;
10                }
11                else{
12                    a[i][j] = Math.max(a[i - 1][j], a[i][j - 1]);
13                }
14            }
15        }
16        int lcs=a[n][m];
17        return n+m-2*lcs;
18    }
19}