public class Solution {
    public int maxNum(int a, int b, int c) {
        if(a >= b && a >= c) {
            return a;
        }
        if(b >= a && b >= c) {
            return b;
        }
        if(c >= a && c >= b) {
            return c;
        }
        return a;
    }
    public int minNum(int a, int b, int c) {
        if(a <= b && a <= c) {
            return a;
        }
        if(b <= a && b <= c) {
            return b;
        }
        if(c <= a && c <= b) {
            return c;
        }
        return a;
    }
    public int maxProduct(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int preMin = nums[0], preMax = nums[0];
        int nowMin, nowMax;
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nowMax = maxNum(preMin * nums[i], preMax * nums[i], nums[i]);
            nowMin = minNum(preMin * nums[i], preMax * nums[i], nums[i]);
            if(nowMax > ans) {
                ans = nowMax;
            }
            preMax = nowMax;
            preMin = nowMin;
        }
        return ans;
    }
}