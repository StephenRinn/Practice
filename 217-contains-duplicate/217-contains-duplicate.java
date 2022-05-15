class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            if(!list.add(nums[i])){return true;}
        }
        
        return false;
    }
}