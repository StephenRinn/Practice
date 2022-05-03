class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] numCopy = Arrays.copyOf(nums,nums.length);
        Arrays.sort(numCopy);
        int ptr1 = -1, ptr2 = -1;
        
        /* Check for empty or single value which can not be rearranged */
        if(nums.length == 0 || nums.length == 1){return 0;}
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != numCopy[i]){
                if(ptr1 == -1){
                    ptr1 = i;
                    i++;
                }
                ptr2 = i;
            }
        }
        
        /* Check if the array was presorted */
        if(ptr1 == ptr2){return 0;}
        
        return (ptr2-ptr1+1);
    }
}