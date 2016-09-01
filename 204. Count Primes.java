public class Solution {
    public int countPrimes(int n) {
        boolean[] isPrimes = new boolean[n];
		for(int i = 2; i < n; i++) {
			isPrimes[i] = true;
		}
		for(int i = 2; i * i < n; i++) {
		    if(!isPrimes[i]) {
		        continue;
		    }
			for(int j = i * i; j < n; j += i) {
				isPrimes[j] = false;
			}
		}
		int ans = 0;
		for(int i = 2; i < n; i++) {
			if(isPrimes[i]) {
				ans++;
			}
		}
		return ans;
    }
}