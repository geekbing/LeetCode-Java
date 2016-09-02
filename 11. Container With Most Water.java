public class Solution {
    public int maxArea(int[] height) {
		int left = 0, right = height.length - 1;
		int ans = 0, area;
		while(left < right) {
			area = (right - left) * (height[left] < height[right] ? height[left++] : height[right--]);
			if(area > ans) {
				ans = area;
			}
		}
		return ans;
    }
}