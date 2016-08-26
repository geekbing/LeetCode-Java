public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0, index = 0;
		int len = nums.length;
		while(index < len)
		{
			if(nums[index] == val)
			{
				index++;
			}
			else
			{
				nums[count++] = nums[index++];
			}
		}
		return count;
    }
}