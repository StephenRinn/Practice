import java.util.HashMap;

// *Solution from my set of notes*

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        // Sort for ease of traversal
        Arrays.sort(candidates);
        
        backtrack(list, new ArrayList<>(), candidates, target, 0); // Recursive call
        return list;
        
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        
        // exit condition
        if(remain < 0) return;
        
        // Successful addtion condition
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        
        // Recursively check each value as many times as needed
        else{ 
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1); // Remove last number
            }
        }
        
    }
}