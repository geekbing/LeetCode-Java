public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<Integer>();
		ans.add(1);
		if(rowIndex == 0)
		{
			return ans;
		}
		ans.add(1);
		if(rowIndex == 1)
		{
			return ans;
		}
		int pre, now;
		int level = 2;
		while(level <= rowIndex)
		{
		    pre = 1;
			for(int i = 1; i < ans.size(); i++)
			{
			    now = ans.get(i);
				ans.set(i, pre + now);
				pre = now;
			}
			ans.add(1);
			level++;
		}
		return ans;
    }
}