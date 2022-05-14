class Solution {
    public int rob(int[] nums) {
        int[] max = nums;
        int tempMax = 0;
        
        for(int i = 0; i < nums.length; i++){
            tempMax = max[i];
            for(int j = i - 2; j >= 0; j--){

                if(max[i] + max[j] > tempMax){
                    tempMax = max[i] + max[j];
                }
            }
            max[i] = tempMax;
        }
        
        tempMax = 0;
        for(int i = 0; i < max.length; i++){
            if(max[i] > tempMax){
                tempMax = max[i];
            }
        }
        
        return tempMax;
    }
}