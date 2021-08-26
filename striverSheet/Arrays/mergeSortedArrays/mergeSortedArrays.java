
// link to Question - https://leetcode.com/problems/merge-sorted-array/


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		// started comparison from the end of both the arrays.
		
        int n1 = m - 1;
        int n2 = n - 1;
        int x = m + n - 1;
        while(n1 >= 0 && n2 >= 0){
            if(nums1[n1] >= nums2[n2])
            {
                nums1[x--] = nums1[n1--];
            }
            else
            {
                nums1[x--] = nums2[n2--];
            }
        }
        
        while(n2 >= 0)
        {
            nums1[x--] = nums2[n2--];
        }
        
    }
}
