// Would checking first and last values first to determine min and max slow or speed evaluation

class Solution {
    public int search(int[] nums, int target) {
        // Check for empty and null input
        if (nums == null || nums.length == 0) return -1;
        
        // Set endpoints
        int left = 0;
        int right = nums.length - 1;
        
        // Iterate through using quicksort pivot method
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        
        // Default return -1 if value isn't found
        return -1;
    }
}