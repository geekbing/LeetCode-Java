public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len < 2)
        {
            return len;
        }
        int i = 0;
        int j = 1;
        while(j < len)
        {
            if(nums[i] != nums[j])
            {
                nums[++i] = nums[j++];
            }
            else
            {
                j++;
            }
        }
        return i+1;
    }
}