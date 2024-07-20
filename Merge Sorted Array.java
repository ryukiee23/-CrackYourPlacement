class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s = m-1;
        int e = n-1;
        int j = m+n-1;

        while(s >= 0 && e >= 0){
            if(nums2[e] >= nums1[s]){
                nums1[j] = nums2[e];
                j--;
                e--;
            }
            else{
                nums1[j] = nums1[s];
                s--;
                j--;
            }
        }

         while(s >= 0)
            nums1[j--] = nums1[s--];
        
        while(e >= 0)
            nums1[j--] = nums2[e--];
    }
}
