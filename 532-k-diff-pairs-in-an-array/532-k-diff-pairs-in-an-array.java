import java.util.HashSet;
import java.util.HashMap;

class Solution {
    public int findPairs(int[] nums, int k) {

        HashSet<Integer> exists = new HashSet<Integer>();
        int count = 0;
        
        // Edge case of k = 0
        if(k == 0){
            HashMap<Integer,Integer> dupe = new HashMap<Integer,Integer>();
            for(int i = 0; i < nums.length; i++){
                dupe.put(nums[i],dupe.getOrDefault(nums[i],0) + 1);
                if(dupe.get(nums[i]) == 2){count++;}
            }
            return count;
        }
        
        // Add value to hashset
        for(int i = 0; i < nums.length; i++){
            exists.add(nums[i]);
        }
        
        // Check for k difference (one directional to get rid of removal issues)
        for(Integer i: exists){
            if(exists.contains(i+k)){
                count++;
            }
        }
        
        return count;
        
    }
}