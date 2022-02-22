import java.util.HashSet;
import java.util.HashMap;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        int[] output = new int[k];
        HashSet<Integer> tempUser = new HashSet<Integer>();
        
        // Check for edge case of 0 length (caught before)
        if(logs.length == 0){
            return output;
        }
        
        // NlogN sort was fastest I could find with a linear repeat check
        Arrays.sort( logs, (a, b) -> Integer.compare(a[0], b[0]) );
        
        // Set up first addition to enable starting at 1
        tempUser.add(logs[0][1]);
        for(int i = 1; i < logs.length; i++){
            if(logs[i][0] == logs[i-1][0] ){
                tempUser.add(logs[i][1]);
            }else if(logs[i][0] != logs[i-1][0] && tempUser.size() - 1 < k){ // Must use size (-1) as it is 1-indexed (caught before)
                output[tempUser.size() - 1] += 1;
                tempUser.clear();
                tempUser.add(logs[i][1]);
            }else if(logs[i][0] != logs[i-1][0] && tempUser.size() - 1 > k){
                tempUser.clear();
                tempUser.add(logs[i][1]);
            }
        }
        
        // Include final user in calculations (Missed until incorrect answer was given)
        output[tempUser.size() - 1] += 1;
        
        
        return output;
    }
}