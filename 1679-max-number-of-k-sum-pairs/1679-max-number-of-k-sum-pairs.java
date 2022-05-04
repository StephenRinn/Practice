class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> values = new HashMap<Integer,Integer>();
        int operations = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(values.containsKey(k - nums[i])){
                operations++;
                if(values.get(k - nums[i]) == 1){
                    values.remove(k - nums[i]);
                }else if(values.get(k - nums[i]) > 1){
                    values.put(k - nums[i], values.get(k - nums[i]) - 1);
                }
            }else{
                values.put(nums[i], values.getOrDefault(nums[i], 0) + 1);
            }
        }
        
        return operations;
    }
}