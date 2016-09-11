public class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
		int max = 0;
		int i = 0;
		while(i < len && i <= max){
			if(i == max && nums[i] == 0 && i != (len - 1)){
				return false;
			}
			if(i + nums[i] > max){
				max = i + nums[i];
			}
			i++;
		}
		return i == len;
    }
}