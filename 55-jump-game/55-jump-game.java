class Solution {
    public boolean canJump(int[] nums) {
        int jump = 0;
        int distance = 2;
        
        if(nums[0] == 0 && nums.length > 1){return false;}
        if(nums[0] == 0 && nums.length == 1){return true;}
        
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] == 0){
                for(int j = i - 1; j >= 0; j--){
                    if(nums[j] >= distance){
                        distance = 2;
                        break;
                    }else{
                        distance++;
                    }
                    if(j == 0){
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
}