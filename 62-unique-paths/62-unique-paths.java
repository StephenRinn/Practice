class Solution {
    public int uniquePaths(int m, int n) {
        /* Check for single path unique circumstance*/
        if(m == 1 || n == 1){ return 1;}
        
        /* Remove Starting position from choices */
        m--;n--;
        
        /* Ensure size order of variables */
        if(m < n){
            m = m + n;
            n = m - n;
            m = m - n;
        }
        
        
        /* Use repeating multiplication and division to save space starting at non cancelled first factor */
        long output = 1;
        int factorialCount = 1;
        
        for(int i = m + 1; i <= m+n; i++, factorialCount++){
            output *= i;
            output /= factorialCount;
        }
        
        return (int)output;
    }
}