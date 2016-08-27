/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void levelTree(List<List<Integer>> ans, TreeNode tree, int level)
	{
		if(tree == null)
		{
			return;
		}
		if(level == ans.size())
		{
			ans.add(0, new ArrayList<Integer>());
		}
		levelTree(ans, tree.left, level + 1);
		levelTree(ans, tree.right, level + 1);
		ans.get(ans.size() - 1 - level).add(tree.val);
	}

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
		levelTree(ans, root, 0);
		return ans;
    }
}