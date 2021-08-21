

//link to Question - https://leetcode.com/problems/maximum-subarray/


// the below solution is the implementation of Kadane's algo
// It will also handle the case of negative elements


class Solution {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int localSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localSum = Math.max(nums[i], nums[i] + localSum);
            maxSum = Math.max(maxSum, localSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));      // should output 6
    }
}
