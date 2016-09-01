public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target <= nums[0]) {
    		return 0;
    	}
    	int len = nums.length;
    	if(target > nums[len - 1]) {
    		return len;
    	}
    	int left = 0;
    	int right = len - 1;
    	int mid;
    	while(right - left > 1) {
    		mid = left + (right - left) / 2;
    		if(nums[mid] < target) {
    			left = mid;
    		}
    		else if(nums[mid] == target) {
    			return mid;
    		}
    		else {
    			right = mid;
    		}
    	}
    	if(nums[left] == target) {
    		return left;
    	}
    	if(nums[right] >= target) {
    		return right;
    	}
    	return 0;
    }
}