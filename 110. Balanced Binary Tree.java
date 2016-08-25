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
    // 递归求的二叉树的最大高度
    public int maxHeight(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        return Math.max(maxHeight(root.left), maxHeight(root.right)) + 1;
    }

    // 递归算法
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        {
            return true;
        }
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1)
        {
            return false;
        }
        else
        {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
}