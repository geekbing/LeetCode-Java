public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(numRows <= 0)
		{
			return ans;
		}
		// 增加第一行
		ArrayList<Integer> newLine = new ArrayList<Integer>();
		newLine.add(1);
		ans.add(newLine);
		if(numRows == 1)
		{
			return ans;
		}
		// 增加第二行
		newLine = new ArrayList<Integer>();
		newLine.add(1);
		newLine.add(1);
		ans.add(newLine);
		if(numRows == 2)
		{
			return ans;
		}
		// 获取上一行
		ArrayList<Integer> pre;
		for(int level = 2; level < numRows; level++)
		{
			pre = (ArrayList<Integer>) ans.get(ans.size() - 1);
			newLine = new ArrayList<Integer>();
			newLine.add(1);
			for(int i = 1; i < pre.size(); i++)
			{
				newLine.add(pre.get(i - 1) + pre.get(i));
			}
			newLine.add(1);
			ans.add(newLine);
		}
		return ans;
    }
}