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
	// 递归的方式
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
		if(root == null){
			return ans;
		}
		if(root.left == null && root.right == null){
			ans.add(root.val);
			return ans;
		}
		if(root.left != null){
			ans.addAll(postorderTraversal(root.left));
		}
		if(root.right != null){
			ans.addAll(postorderTraversal(root.right));	
		}
		ans.add(root.val);
		return ans;
    }
}