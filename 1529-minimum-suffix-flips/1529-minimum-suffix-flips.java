class Solution {
    public int minFlips(String target) {
        
        int start = target.indexOf('1');
        int total = 1;
        
        if(start == -1){return 0;}
        
        int inputLength = target.length();
        char prev = '1';
        
        for(int i = start; i < target.length(); i++){
            if(target.charAt(i) != prev){
                prev = target.charAt(i);
                total++;
            }
        }
        
        return total;
    }
}