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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root != null && root.val == sum && root.left == null && root.right == null)
        {
            return true;
        }
        if(root == null && sum == 0)
        {
            return false;
        }
        if(root == null && sum != 0)
        {
            return false;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}