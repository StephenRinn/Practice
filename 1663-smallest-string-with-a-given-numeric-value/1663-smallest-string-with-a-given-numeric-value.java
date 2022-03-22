class Solution {
    public String getSmallestString(int n, int k) {
        int pos = n - 1;
        k -= n;
        char[] out = new char[n];
        
        /* Backfill array with z until values are too low*/
        while(k > 0){
            if(k >= 25){
                out[pos] = 'z';
                k -= 25;
                pos--;
            }else{
                int charValue = k + 97; /* 97 just converts to ascii */
                out[pos] = (char)charValue;
                k = 0;
                pos--;
            }
        }
        
        /* fill rest of array with a */
        for(int i = 0; i <= pos; i++){
            out[i] = 'a';
        }
        
        return String.valueOf(out);
    }
}