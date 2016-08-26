public class Solution {
	// 基本思路就是遍历字符串，如果当前字符比后面一位字符对应的数值小，则减去当前字符对应的数值，否则加上当前字符对应的数值。
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        Integer now, next;
		int ans = 0, len = s.length();
        for(int i = 0; i < len - 1; i++)
        {
            now = map.get(s.charAt(i)).intValue(); 
            next = map.get(s.charAt(i+1)).intValue();
            if(now < next)
            {
                ans -= now;
            }
            else
            {
                ans += now;
            }
        }
        ans += map.get(s.charAt(len - 1));
        return ans;
    }
}