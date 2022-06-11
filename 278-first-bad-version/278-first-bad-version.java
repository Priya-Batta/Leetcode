/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        while(left<=n) {
            int mid = left + (n - left)/2;
            if(!isBadVersion(mid)) {
                left = mid + 1;
            }
            else if((mid) > 0 && isBadVersion(mid) && !isBadVersion(mid-1)) {
                return mid;
            }
            else {
                n = mid - 1;
            }
        }
        return -1;
    }
}