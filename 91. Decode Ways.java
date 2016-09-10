public class Solution {
    //	动态规划，令dp[i]表示字符串的前i个字符的可能的编码方式的数量
    //	如果当前数字为0，则前面数字必为1或者2，否则无法进行编码转换，此时的数字0只能和前面的1或者2连在一起进行编码，因此dp[i] = dp[i-2]；
    //	如果前面数字为1或者前面数字为2且当前数字在1~6之间，说明都可以进行2种编码（分开或者和在一起），因此dp[i] = dp[i-1] + dp[i-2]；
    //	其他情况，当前数字必须单独进行编码转换，因此dp[i] = dp[i-1]
    public int numDecodings(String s) {
        int len = s.length();
		if(len == 0){
			return 0;
		}
		int[] dp = new int[len + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;
		char pre, now;
		for(int i = 2; i <= len; i++){
			pre = s.charAt(i - 2);
			now = s.charAt(i - 1);
			if(now == '0'){
			    if(pre == '1' || pre == '2'){
			        dp[i] = dp[i - 2];    
			    }
			    else{
			        return 0;   
			    }
			}
			else if((pre == '1') || (pre == '2' && '1' <= now && now <= '6')){
				dp[i] = dp[i - 2] + dp[i - 1];
			}
			else{
				dp[i] = dp[i - 1];
			}
		}
		return dp[len];
    }
}