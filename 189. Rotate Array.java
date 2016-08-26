public class Solution {
    // 将数组元素从[left,right]反转
    public void reverse(int[] arr, int left, int right)
	{
		int temp;
		while(left < right)
		{
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
	}

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if((len > 1) && (k % len != 0))
        {
            int step = len - k % len;
            reverse(nums, 0, step - 1);
		    reverse(nums, step, nums.length - 1);
		    reverse(nums, 0, nums.length - 1);
        }
    }
}