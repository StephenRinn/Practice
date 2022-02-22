import java.util.HashSet;
import java.util.HashMap;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        int[] output = new int[k];
        HashSet<Integer> tempUser = new HashSet<Integer>();
        
        if(logs.length == 0){
            return output;
        }
        
        Arrays.sort( logs, (a, b) -> Integer.compare(a[0], b[0]) );
        
        tempUser.add(logs[0][1]);
        for(int i = 1; i < logs.length; i++){
            if(logs[i][0] == logs[i-1][0] ){
                tempUser.add(logs[i][1]);
            }else if(logs[i][0] != logs[i-1][0] && tempUser.size() - 1 < k){
                output[tempUser.size() - 1] += 1;
                tempUser.clear();
                tempUser.add(logs[i][1]);
            }else if(logs[i][0] != logs[i-1][0] && tempUser.size() - 1 > k){
                tempUser.clear();
                tempUser.add(logs[i][1]);
            }
        }
        output[tempUser.size() - 1] += 1;
        
        
        return output;
    }
}