// Last updated: 7/14/2026, 2:01:42 PM
class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int a=nums[i][i];
            int b=nums[i][n-i-1];
            int c=0;
            if(a>=2){
            c=1;
            for(int j=2;j*j<=a;j++){
                if(a%j==0){
                c=0;
                break;
                }
            }
            if(c==1&&a>max)
            max=a;
        }
        c=0;
        if(b>=2){
            c=1;
            for(int j=2;j*j<=b;j++){
                if(b%j==0){
                c=0;
                break;
                }
            }
            if(c==1&&b>max)
            max=b;
        }
        }
        return max;
    }
}