public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0, len = nums.length; i < len; i++)
		{
			if(i > k)
			{
				set.remove(nums[i - k - 1]);
			}
			if(!set.add(nums[i]))
			{
				return true;
			}
		}
		return false;
    }
}