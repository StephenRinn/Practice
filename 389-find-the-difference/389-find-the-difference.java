class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] alpha = new int[26];
        int asciiOffset = 97;

        
        for(int i = 0; i < s.length(); i++){
            alpha[s.charAt(i) - asciiOffset]++;
        }
        
        for(int i = 0; i < t.length(); i++){
            alpha[(t.charAt(i) - asciiOffset)]--;
            if(alpha[t.charAt(i) - asciiOffset]<0){
                return t.charAt(i);
            }
        }
        
        return t.charAt(0);
    }
}