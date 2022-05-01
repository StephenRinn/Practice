import java.util.HashMap;
import java.lang.Math.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        int currentMax = intervals[0][1];
        int currentMin = intervals[0][0];
        HashMap<Integer,Integer> interval = new HashMap<Integer,Integer>();
        
        
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= currentMax){
                currentMax = Math.max(currentMax, intervals[i][1]);
            }else if(intervals[i][0] > currentMax){
                interval.put(currentMin,currentMax);
                currentMin = intervals[i][0];
                currentMax = intervals[i][1];
            }
        }
        
        interval.put(currentMin,currentMax);
        
        int[][] output = new int[interval.size()][2];
        int loop = 0;
        
        
        for(Integer currentKey : interval.keySet()){
            output[loop][0] = currentKey;
            output[loop][1] = interval.get(currentKey);
            loop++;
        }
        
        return output;
    }
}