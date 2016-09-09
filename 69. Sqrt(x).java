public class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
    	int left = 0;
    	int right = x;
    	if(x > 46340){
    	    right = 46340;
    	}
    	int mid = left + (right - left) / 2;
    	
    	while(right - left > 1){
    		if(mid * mid > x){
    			right = mid - 1;
    		}
    		else if(mid * mid == x){
    			return mid;
    		}
    		else{
    			left = mid;
    		}
            mid = left + (right - left) / 2;
    	}
    	return (right * right) <= x ? right : left;
    }
}