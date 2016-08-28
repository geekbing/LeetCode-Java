public class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char key;
        Integer val;
        for(int i = 0, len = s.length(); i < len; i++) 
        {
        	key = s.charAt(i);
        	val = map.get(key);
        	val = (val == null) ? 1 : val + 1;
        	map.put(key, val);
        }
        for(int i = 0, len = t.length(); i < len; i++)
        {
        	key = t.charAt(i);
        	val = map.get(key);
        	if(val == null || val == 0)
        	{
        		return key;
        	}
        	else
        	{
        		map.put(key, val - 1);
        	}
        }
        return ' ';
    }
}