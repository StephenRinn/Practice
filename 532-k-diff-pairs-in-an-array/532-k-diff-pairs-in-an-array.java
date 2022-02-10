import java.util.HashSet;

class Solution {
    public int findPairs(int[] nums, int k) {

        HashSet<Integer> exists = new HashSet<Integer>();
        HashSet<Integer> dupe = new HashSet<Integer>();
        Integer previous = 0;
        int count = 0;
        
        if(k == 0){
            for(int i = 0; i < nums.length; i++){
                if(exists.contains(nums[i]) && !dupe.contains(nums[i])){
                    count++;
                    dupe.add(nums[i]);
                }else if(!exists.contains(nums[i])){
                    exists.add(nums[i]);
                }
            }
            return count;
        }
        
        // Add value to hashset
        for(int i = 0; i < nums.length; i++){
            exists.add(nums[i]);
            dupe.add(nums[i]);
        }
        

        for(Integer i: exists){
            if(dupe.contains(i-k)){
                count++;
            }
            if(dupe.contains(i+k)){
                count++;
            }
            dupe.remove(i);
        }
        
        return count;
        
    }
}