
//link to Question - https://leetcode.com/problems/longest-consecutive-sequence/


class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> h = new HashSet<>();
        
        
        for(int i = 0; i < nums.length; i++)
            h.add(nums[i]);
        
        
        int res = 0;
        int curr_ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(!h.contains(nums[i] - 1)){
                int j = nums[i];
                
                while(h.contains(j))
                    j++;
                
                res = Math.max(res, j - nums[i]);
            }
        }
        
        return res;
        
    }
}
