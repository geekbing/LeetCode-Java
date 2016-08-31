public class Solution {
    private int[] origin;
    Random rand;

    public Solution(int[] nums) {
        this.origin = nums;
        rand = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.origin;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] ans = origin.clone();
        int temp, random;
        for(int i = ans.length - 1; i >= 0; i--)
        {
            random = rand.nextInt(i + 1);
            temp = ans[random];
            ans[random] = ans[i];
            ans[i] = temp;
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */