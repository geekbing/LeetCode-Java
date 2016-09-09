public class Solution {
    public double myPow(double x, int n) {
        double[] arr = new double[32];
		arr[0] = x;
		for(int i = 1; i < 32; i++){
			arr[i] = arr[i - 1] * arr[i - 1];
		}
		double ans = 1.0;
		int absN = n;
		if(n < 0){
			absN = -absN;
		}
		for(int i = 0; i < 32; i++){
			if((absN & (1<<i)) != 0){
				ans *= arr[i];
			}
		}
		if(n < 0){
			ans = 1.0 / ans;
		}
		return ans;
    }
}