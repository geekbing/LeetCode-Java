public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int ABCD = (C - A) * (D - B);
		int EFGH = (G - E) * (H - F);
		// 相交矩形的上、下、左、右边
		int up = Math.min(D, H);
		int down = Math.max(B, F);
		int left = Math.max(A, E);
		int right = Math.min(C, G);
		// 如果有交集
		if(up > down && left < right)
		{
			return ABCD + EFGH - (up - down) * (right - left);
		}
		return ABCD + EFGH;
    }
}