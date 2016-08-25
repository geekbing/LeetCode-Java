public class Solution {
    public void moveZeroes(int[] nums) {
        int zeroNum = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++)
        {
            if(nums[i] == 0)
            {
                zeroNum++;
            }
            else
            {
                nums[i - zeroNum] = nums[i];
            }
        }
        for(int i = 0; i < zeroNum; i++)
        {
            nums[len - 1 - i] = 0;
        }
    }
}