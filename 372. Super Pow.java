public class Solution {
    public int power(int a, int b){
		if(b == 0){
			return 1;
		}
		if(b == 1){
			return a % 1337;
		}
		return power(a % 1337, b / 2) * power(a % 1337, b - b / 2) % 1337; 
	}
    public int superPow(int a, int[] b) {
    	int ans = 1;
    	for(int i = 0, len = b.length; i < len; i++){
    		ans = power(ans, 10) * power(a, b[i]) % 1337;
    	}
    	return ans;
    }
}