import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        long half = nums.length / 2;
        int check = 0;
        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();
        
        for(int i: nums){
            check = count.getOrDefault(i,0) + 1;
            if(check > half){
                return i;
            }
            count.put(i,check);
        }
        
        return 0;
    }
}