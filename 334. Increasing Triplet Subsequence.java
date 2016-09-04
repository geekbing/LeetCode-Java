public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int midNum = Integer.MAX_VALUE;
        for(int i = 0, len = nums.length; i < len; i++) {
        	if(nums[i] > midNum) {
        		return true;
        	}
        	if(nums[i] > minNum && nums[i] < midNum) {
        		midNum = nums[i];
        	}
        	else if(nums[i] < minNum) {
        		minNum = nums[i];
        	}
        }
        return false;
    }
}