public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String bin = Integer.toBinaryString(n);
        int sum = 0;
        
        for(int i = 0; i < bin.length(); i++){
            if(bin.charAt(i) == '1'){
                sum++;
            }
        }
        
        return sum;
    }
}