public class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
		if(len == 1 || nums[0] > nums[1]){
			return 0;
		}
		int left = 0;
		int right = len - 1;
		int mid;
		while(left < right){
			mid = left + (right - left) / 2;
			if(nums[mid] < nums[mid + 1]) {
				left = mid + 1;
			}
			else {
				right = mid;
			}
		}
		return left;
    }
}