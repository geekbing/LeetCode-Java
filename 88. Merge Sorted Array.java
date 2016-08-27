public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 从最后开始向前填充
		int last = m + n - 1;
		int mLast = m - 1;
		int nLast = n - 1;
		while(last >= 0)
		{
			if(mLast < 0)
			{
				nums1[last--] = nums2[nLast--];
				continue;
			}
			if(nLast < 0)
			{
				return;
			}
			if(nums1[mLast] < nums2[nLast])
			{
				nums1[last--] = nums2[nLast--];
			}
			else
			{
				nums1[last--] = nums1[mLast--];
			}
		}
    }
}