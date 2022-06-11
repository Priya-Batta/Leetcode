/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        while(left<n) {
            int mid = left + (n - left)/2;
            if(isBadVersion(mid)) {
                n = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
}