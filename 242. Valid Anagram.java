public class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
    	HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();
    	
    	char c;
    	Integer num;
    	for(int i = 0; i < s.length(); i++)
    	{
    		c = s.charAt(i);
    		num = mapS.get(c);
    		num = (num == null) ? 1 : (num + 1);
    		mapS.put(c, num);
    	}
    	for(int i = 0; i < t.length(); i++)
    	{
    		c = t.charAt(i);
    		num = mapT.get(c);
    		num = (num == null) ? 1 : (num + 1);
    		mapT.put(c, num);
    	}
    	if(!mapS.equals(mapT))
    	{
    		return false;
    	}
    	return true;
    }
}