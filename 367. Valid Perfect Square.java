public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 0) {
			return false;
		}
		if(num == 0 || num == 1) {
			return true;
		}
        int left = 1;
        int right = num / 2;
        if(num > 46340) {
			right = 46340;
		}
        int mid;
        int temp;
        while(right - left > 1) {
        	mid = left + (right - left) / 2;
        	temp = mid * mid;
        	if(temp < num) {
        		left = mid;
        	}
        	else if(temp == num) {
        		return true;
        	}
        	else {
        		right = mid;
        	}
        }
        if(left * left == num || right * right == num) {
        	return true;
        }
        else {
        	return false;
        }
    }
}