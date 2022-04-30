import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int tally = 0;
        
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> repeats = new HashSet<Character>();
            repeats.add(s.charAt(i));
            tally = 1;
            for(int n = i + 1; n < s.length(); n++){
                if(repeats.contains(s.charAt(n))){
                    if(tally > max){
                        max = tally;
                    }
                    break;
                }
                tally++;
                repeats.add(s.charAt(n));
            }
            if(tally > max){
                max = tally;
            }
        }
        return max;
    }
}