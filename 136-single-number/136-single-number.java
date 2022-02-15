import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        
        int output = 0;
        
        for(int i: nums){
            output ^= i;
        }
        
        return output;
    }
}