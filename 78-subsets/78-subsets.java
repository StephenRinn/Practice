// Worked through but this is such a good idea, wanted to save and work through it

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        output.add(new ArrayList<Integer>());

        for(int value: nums){
            int index = output.size();
            for(int i = 0; i < index; i++){
                ArrayList<Integer> tempArray = new ArrayList<>(output.get(i));
                tempArray.add(value);
                output.add(tempArray);
            }
        }

        return output;
    }
}