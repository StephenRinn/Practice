import java.util.HashSet;

class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> NumberCount = new HashSet<Integer>();
        int singleDigit = 0;
        
        // Check hashset and delete it if it exists
        for(int i : nums){
            if(NumberCount.contains(i)){
                NumberCount.remove(i);
            }else{
                NumberCount.add(i);
            }
        }
        
        // find only remaining solo number
        for(int i : NumberCount){
            singleDigit = i;
        }
        
        return singleDigit;
    }
}