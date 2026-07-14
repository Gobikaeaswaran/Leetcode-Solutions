// Last updated: 7/14/2026, 2:02:10 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=m;
        for(int i=0;i<n;i++){
            nums1[k]=nums2[i];
            k++;
        }
        for(int i=0;i<m+n;i++){
            for(int j=i+1;j<m+n;j++){
                if(nums1[i]>nums1[j]){
                    int t=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=t;
                }
            }
        }
    }
}