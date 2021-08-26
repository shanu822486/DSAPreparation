
//link to question - https://leetcode.com/problems/two-sum/submissions/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        if(nums.length <= 1)
            return new int[0];
        
        HashMap<Integer,Integer> h = new HashMap<>();
        
        int a[] = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            
            int val = target - nums[i];
            
            if(h.containsKey(val))
            {
                a[0] = h.get(val);
                a[1] = i;
                break;
            }
                
            
            else
                h.put(nums[i], i);
        }
        
        return a;
        
    }
}
