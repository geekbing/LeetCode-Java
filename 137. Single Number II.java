public class Solution {
    public int singleNumber(int[] nums) {
        int[] arr = new int[32];
    	for(int i = 0; i < 32; i++) {
    		arr[i] = 0;
    	}
    	for(int num : nums) {
    		for(int i = 0; i < 32; i++) {
    			arr[31 - i] += num & 1;
    			num = num >> 1;
    		}
    	}
    	int ans = 0;
    	for(int i = 0; i < 32; i++) {
    		ans = ans * 2 + arr[i] % 3;
    	}
    	return ans;
    }
}