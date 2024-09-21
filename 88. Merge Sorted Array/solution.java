class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }
        for(int i = 0; i < m + n; i++){
            for(int ii = 0; ii < i; ii++){
                if(nums1[ii] > nums1[i]){
                    int temp = nums1[i];
                    nums1[i] = nums1[ii];
                    nums1[ii] = temp;
                }
            }
        }

    }
}
