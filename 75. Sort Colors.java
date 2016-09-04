public class Solution {
    public void sortColors(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int i = 0;
		int temp;
		while(i <= right) {
			if(nums[i] == 0 && i != left) {
				temp = nums[i];
				nums[i] = nums[left];
				nums[left] = temp;
				left++;
			}
			else if(nums[i] == 2 && i != right) {
				temp = nums[i];
				nums[i] = nums[right];
				nums[right] = temp;
				right--;
			}
			else {
			    i++;
			}
		}
    }
}