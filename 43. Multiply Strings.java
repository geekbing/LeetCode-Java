public class Solution {
    // 一个字符串乘以另一个整数
	public String multi(String num1, int times){
		if(times == 0){
			return "0";
		}
		String ans = "";
		int carry = 0;
		int now;
		for(int i = num1.length() - 1; i >= 0; i--){
			now = Integer.parseInt("" + num1.charAt(i)) * times + carry;
			carry = now / 10;
			now = now % 10;
			ans = "" + now + ans;
		}
		if(carry > 0){
			ans = "" + carry + ans;
		}
		return ans;
	}
	
	// 两个字符串相加
    public String add(String num1, String num2){
    	if(num1.equals("0")){
    		return num2;
    	}
    	if(num2.equals("0")){
    		return num1;
    	}
    	int len1 = num1.length();
    	int len2 = num2.length();
    	// 前面使用0填充
    	String zeroFill = "";
    	for(int i = 0, len = Math.abs(len1 - len2); i < len; i++){
    		zeroFill += "0";
    	}
    	if(len1 < len2){
    		num1 = zeroFill + num1;
    	}
    	else{
    		num2 = zeroFill + num2;
    	}
    	String ans = "";
    	int carry = 0;
    	int now;
    	for(int i = num1.length() - 1; i >= 0; i--){
    		now = Integer.parseInt("" + num1.charAt(i)) + Integer.parseInt("" + num2.charAt(i)) + carry;
    		if(now > 9){
    			carry = 1;
    			now = now - 10;
    		}
    		else{
    			carry = 0;
    		}
    		ans = "" + now + ans;
    	}
    	if(carry == 1){
    		ans = "1" + ans;
    	}
    	return ans;
    }

    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		String ans = multi(num1, Integer.parseInt("" + num2.charAt(num2.length() - 1)));;
		String zeroFill = "";
		String temp = "";
		for(int i = num2.length() - 2; i >= 0; i--){
			temp = multi(num1, Integer.parseInt("" + num2.charAt(i)));
			zeroFill = "0" + zeroFill;
			temp += zeroFill;
			ans = add(ans, temp);
		}
		return ans;
    }
}