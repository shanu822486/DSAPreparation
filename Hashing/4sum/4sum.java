
//link to question - https://leetcode.com/problems/4sum/

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(nums.length <= 3)
            return res;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int left = j + 1;
                int right = nums.length - 1;
                
                int rem_target = target - nums[i] - nums[j];
                
                
                while(left < right){
                    
                    int leftRightSum = nums[left] + nums[right];
                    
                    if(leftRightSum > rem_target) right--;
                    else if(leftRightSum < rem_target) left++;
                    
                    
                    else{
                        List<Integer> tuple = new ArrayList<Integer>();
                        
                        tuple.add(nums[i]);
                        tuple.add(nums[j]);
                        tuple.add(nums[left]);
                        tuple.add(nums[right]);
                        
                        res.add(tuple);
                        
                        while(left < right && nums[left] == tuple.get(2)) left++;
                        while(left < right && nums[right] == tuple.get(3))right--;
                    }
                   
                }
                
                while(j + 1 < nums.length && nums[j] == nums[j + 1])j++;
                
            }
            
            while(i + 1 < nums.length && nums[i] == nums[i + 1])i++;
        }
        
        return res;
    }
}
