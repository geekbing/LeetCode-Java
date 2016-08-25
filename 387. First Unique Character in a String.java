public class Solution {
    public int firstUniqChar(String s) {
        // 使用有序map来保存当前字符和对应的位置，如果后续再次遇到该字符，则将当前字符对应位置修改为一个特定值，标示重复。
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char key;
		Integer val;
		for(int i = 0, len = s.length(); i < len; i++)
		{
			key = s.charAt(i);
			val = map.get(key);
			if(val == null)
			{
				map.put(key, i);
			}
			else
			{
				map.put(key, -1);
			}
		}
		for(char key1 : map.keySet())
		{
			val = map.get(key1).intValue();
			if(val != -1)
			{
				return val;
			}
		}
		return -1;
    }
}