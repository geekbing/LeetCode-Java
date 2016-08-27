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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
		{
			return new ArrayList<String>();
		}
		List<String> ans = new ArrayList<String>();
		if(root.left != null)
		{
			List<String> left = binaryTreePaths(root.left);
			for(int i = 0, len = left.size(); i < len; i++)
			{
				ans.add(root.val + "->" + left.get(i));
			}
		}
		if(root.right != null)
		{
			List<String> right = binaryTreePaths(root.right);
			for(int i = 0, len = right.size(); i < len; i++)
			{
				ans.add(root.val + "->" + right.get(i));
			}
		}
		if(root.left == null && root.right == null)
		{
			ans.add(Integer.toString(root.val));
		}
		return ans;
    }
}