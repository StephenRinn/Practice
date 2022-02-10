// Study (failed on size using array - only considered small fast implementations because of test inputs.)

// Traverses once and creates a N sized map - Really clever solution remember
class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // check for subarray based on removing the target from the sum
            // then position of (sum - k) + 1 is start of array that sums to target
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}