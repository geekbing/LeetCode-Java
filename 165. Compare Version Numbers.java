public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] strArr1 = version1.split("\\.");
		String[] strArr2 = version2.split("\\.");
		int len1 = strArr1.length;
		int len2 = strArr2.length;
		int len = len1 < len2 ? len1 : len2;
		int i = 0;
		while(i < len)
		{
			if(Integer.parseInt(strArr1[i]) > Integer.parseInt(strArr2[i]))
			{
				return 1;
			}
			else if(Integer.parseInt(strArr1[i]) < Integer.parseInt(strArr2[i]))
			{
				return -1;
			}
			i++;
		}
		if(len1 > len2)
		{
			i = len;
			while(i < len1)
			{
				if(Integer.parseInt(strArr1[i]) != 0)
				{
					return 1;
				}
				i++;
			}
		}
		else if(len1 == len2)
		{
			return 0;
		}
		else
		{
			i = len;
			while(i < len2)
			{
				if(Integer.parseInt(strArr2[i]) != 0)
				{
					return -1;
				}
				i++;
			}
		}
		return 0;
    }
}