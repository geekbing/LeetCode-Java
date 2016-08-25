public class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapG = new HashMap<Character, Integer>();
        
        int bull = 0;
        int cow = 0;
        char key;
        Integer val;
        for(int i = 0; i < len; i++)
        {
        	key = secret.charAt(i);
        	val = mapS.get(key);
        	val = (val == null) ? 1 : (val + 1);
        	mapS.put(key, val);
        	
        	key = guess.charAt(i);
        	val = mapG.get(key);
        	val = (val == null) ? 1 : (val + 1);
        	mapG.put(key, val);
        	if(secret.charAt(i) == guess.charAt(i))
        	{
        		cow++;
        	}
        }
        for(char key1 : mapS.keySet())
        {
        	Integer valG = mapG.get(key1);
        	if(valG != null)
        	{
        		bull += Math.min(mapS.get(key1), valG);
        	}
        }
        bull -= cow;
        
        return cow + "A" + bull + "B"; 
    }
}