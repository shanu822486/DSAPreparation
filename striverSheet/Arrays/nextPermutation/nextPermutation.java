import java.util.Arrays;

// link to QUESTION - https://leetcode.com/problems/next-permutation/


class Solution {


    public static int[] reverse(int a[], int left, int right) {

        // Reverse the sub-array
        while (left < right) {
            int temp = a[left];
            a[left++] = a[right];
            a[right--] = temp;
        }

        // Return the updated array
        return a;
    }


    public static void nextPermutation(int[] nums) {

        if (nums.length <= 1)
            return;

        int last = nums.length - 2;

        while (last >= 0) {
            if (nums[last] < nums[last + 1])
                break;
            last--;
        }

        if (last < 0) {
            Arrays.sort(nums);
            return;
        }

        int nextGreaterElement = -1;

        for (int i = nums.length - 1; i > last; i--) {
            if (nums[i] > nums[last]) {
                nextGreaterElement = i;
                break;
            }
        }

        //swap elements 
        int t = nums[last];
        nums[last] = nums[nextGreaterElement];
        nums[nextGreaterElement] = t;
        reverse(nums, last + 1, nums.length - 1);
        return;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
