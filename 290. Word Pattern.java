public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
		int len = pattern.length();
		if(len != arr.length)
		{
			return false;
		}
		HashMap<Character, String> map = new HashMap<Character, String>();
		Character key;
		String val;
		for(int i = 0; i < len; i++)
		{
			key = pattern.charAt(i);
			if(map.keySet().contains(key))
			{
				val = map.get(key);
				if(!val.equals(arr[i]))
				{
					return false;
				}
			}
			else
			{
			    if(map.containsValue(arr[i]))
				{
					return false;
				}
				map.put(key, arr[i]);
			}
		}
		return true;
    }
}