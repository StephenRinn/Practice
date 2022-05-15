/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1 || isBadVersion(1)){return 1;}
        
        int mid = n/2;
        int high = n;
        int low = 1;
        
        if(isBadVersion(mid)){
            high = mid;
        }else{
            low = mid;
        }
        
        while(high - low > 1){
            mid = ((high - low) / 2) + low;
            if(isBadVersion(mid)){
                high = mid;
            }else{
                low = mid;
            }
        }
        
        return high;
    }
}