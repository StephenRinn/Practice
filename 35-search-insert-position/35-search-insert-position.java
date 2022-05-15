class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int mid = (high - low)/2;
        
        while(high - low > 1){
            mid = ((high - low)/2) + low;
            if(nums[mid] == target){return mid;}
            else if(nums[mid] > target){high = mid;}
            else if(nums[mid] < target){low = mid;}
        }
        
        if(nums[low] >= target){return low;}
        return high;
    }
}