public class Solution {
    // 求最大公约数
    public int gcd(int x, int y){
		int t;
		while(x % y != 0){
			t = x % y;
			x = y;
			y = t;
		}
		return y;
	}

    public boolean canMeasureWater(int x, int y, int z) {
        // 排除特殊情况
		if(z == 0){
			return true;
		}
		if(z > x + y) {
			return false;
		}	
		return z % gcd(x, y) == 0;
    }
}