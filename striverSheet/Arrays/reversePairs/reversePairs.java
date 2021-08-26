
//link to question -  https://leetcode.com/problems/reverse-pairs/


// can also be done with brute force . TC - O(n ^ 2)

// efficient solution using merge sort . TC - O(n log n)

class Solution {
    
    //using merge Sort 
    // It is similar to 'count inversion in array' with a little modification
    
    public static int merge(int nums[], int left, int mid, int right){
        
        int count = 0;
        
        int i = left;
        int j = mid + 1;
        
        for(;i <= mid; i++){
            while(j <= right && nums[i] > (2 * (long)nums[j])){
                j++;
            }
            
            count += j - mid - 1;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        i = left;
        j = mid + 1;
        while(i <= mid && j <= right){
            if(nums[i] < nums[j])
                arr.add(nums[i++]);
            else
                arr.add(nums[j++]);
            
        }
        
        while(i <= mid)
            arr.add(nums[i++]);
        
        while(j <= right)
            arr.add(nums[j++]);
        
        for(int k = left; k <= right; k++){
            nums[k] = arr.get(k - left);
        }
        
        return count;
        
    }
    
    
    
    public static int mergeSort(int nums[] , int left, int right){
        
        if(left >= right) return 0;
        
        int mid = (left + right) / 2; 
        int count = mergeSort(nums, left, mid);
        count   += mergeSort(nums, mid + 1 , right);
        
        count += merge(nums, left, mid, right);
        return count;
        
    }
    
    
    public int reversePairs(int[] nums) {
        
        return mergeSort(nums, 0, nums.length - 1);
    }
}
