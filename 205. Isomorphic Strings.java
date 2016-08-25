public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        if(len != t.length())
        {
            return false;
        }
        char key;
        Character val;
        char tempVal;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < len; i++)
        {
        	key = s.charAt(i);
        	val = map.get(key);
        	tempVal = t.charAt(i);
        	// 不纯在对应关系
        	if(val == null)
        	{
        	    // 但是却包含值
        		if(map.containsValue(tempVal))
        		{
        			return false;
        		}
        		else
        		{
        			map.put(key, tempVal);
        		}
        	}
        	else
        	{
        		if(val.charValue() != tempVal)
        		{
        			return false;
        		}
        	}
        }
        return true;
    }
}