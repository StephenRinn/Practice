import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> valuePos = new HashMap<Integer,Integer>();
        int[] output = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            if(valuePos.containsKey((target-nums[i]))){
                output[0] = i;
                output[1] = valuePos.get(target-nums[i]);
                return output;
            }else{
                valuePos.put(nums[i], i);
            }
        }
        return output;
    }
}