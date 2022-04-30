import java.util.HashSet;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> threePairs = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            Map<Integer,Integer> zeroMap = new HashMap();
            for(int j = i+1; j < nums.length; j++) {
                if(zeroMap.containsKey(0 - nums[i] - nums[j])) {
                    int k = zeroMap.get(0 - nums[i] - nums[j]);
                    if(k == i || k == j) {
                        continue;
                    }else {
                        List<Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[k]);
                        list.add(nums[j]);
                        threePairs.add(list);
                    }                  
                }
                zeroMap.put(nums[j],j);
            }
        }
        List<List<Integer>> threeSum = new ArrayList();
        threeSum.addAll(threePairs);
        return threeSum;
    }
}