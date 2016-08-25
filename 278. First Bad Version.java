/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n <= 0)
        {
            return 0;
        }
        if(isBadVersion(1))
        {
            return 1;
        }
        int left = 2;
        int right = n;
        int min = left + (right - left) / 2;
        while(left <= right)
        {
            if(isBadVersion(left))
            {
                return left;
            }
            min = left + (right - left) / 2;
            if(isBadVersion(min))
            {
                right = min;
            }
            else
            {
                left = min + 1;
            }
        }
        return left;
    }
}