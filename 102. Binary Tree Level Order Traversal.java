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
    // 二叉树按照层次遍历
    public void levelTree(List<List<Integer>> ans, TreeNode tree, int level)
	{
		if(tree == null)
		{
			return;
		}
		if(level == ans.size())
		{
			ans.add(new ArrayList<Integer>());
		}
		ans.get(level).add(tree.val);
		levelTree(ans, tree.left, level + 1);
		levelTree(ans, tree.right, level + 1);
	}

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
		levelTree(ans, root, 0);
		return ans;
    }
}