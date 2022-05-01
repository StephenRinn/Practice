class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tempSum = 0;
        
        for(int num: nums){
            tempSum += num;
            if(tempSum > max){
                max = tempSum;
            }
            if(tempSum < 0){
                tempSum = 0;
            }
        }
        
        return max;
    }
}