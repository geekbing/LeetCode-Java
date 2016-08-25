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
    // 检查两棵树是不是刚好相反
    public boolean check(TreeNode left, TreeNode right)
	{
		if(left == null && right == null)
		{
			return true;
		}
		if((left == null && right != null) || (left != null && right == null))
		{
			return false;
		}
		if(left.val != right.val)
		{
			return false;
		}
		return check(left.left, right.right) && check(left.right, right.left);
	}
	
    public boolean isSymmetric(TreeNode root) 
    {
        if(root == null)
        {
            return true;
        }
        return check(root.left, root.right);
    }
}