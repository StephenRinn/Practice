class Solution {
    public boolean canJump(int[] nums) {
        int[] canReach = new int[nums.length];
        canReach[0] = 1;
        int jump = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            if(canReach[i] == 1){
                jump = nums[i];
                for(int j = 1; j <= jump; j++){
                    if(j+i < (nums.length)){
                        canReach[j + i] = 1;
                    } 
                }
            }
        }
        
        return canReach[nums.length-1] == 1;
    }
}