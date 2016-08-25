public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mapR = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapM = new HashMap<Character, Integer>();
		
		char key;
		Integer val;
		for(int i = 0; i < ransomNote.length(); i++)
		{
			key = ransomNote.charAt(i);
			val = mapR.get(key);
			val = (val == null) ? 1 : (val + 1);
			mapR.put(key, val);
		}
		for(int i = 0; i < magazine.length(); i++)
		{
			key = magazine.charAt(i);
			val = mapM.get(key);
			val = (val == null) ? 1 : (val + 1);
			mapM.put(key, val);
		}
		for(char k : mapR.keySet())
		{
			if(mapM.get(k) == null || mapM.get(k) < mapR.get(k))
			{
				return false;
			}
		}
		return true;
    }
}