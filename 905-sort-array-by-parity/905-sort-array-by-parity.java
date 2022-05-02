class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] sorted = new int[nums.length];
        int ptrEven = 0;
        int ptrOdd = nums.length -1;
        
        for(int n: nums){
            if(n%2 == 0){
                sorted[ptrEven] = n;
                ptrEven++;
            }else{
                sorted[ptrOdd] = n;
                ptrOdd--;
            }
        }
        
        return sorted;
    }
}