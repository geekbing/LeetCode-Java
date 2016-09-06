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
    // 递归遍历得到二叉树的所有路径字符串
    public ArrayList<String> traverse(TreeNode root){
		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<String> left, right;
		if(root == null){
			return ans;
		}
		if(root.left == null && root.right == null){
		    ans.add("" + root.val);
		    return ans;
		}
		if(root.left != null){
			left = traverse(root.left);
			// 将左边每一项前面增加 root.val，并增加到ans
			for(int i = 0, len = left.size(); i < len; i++) {
				ans.add("" + root.val + left.get(i));
			}
		}
		if(root.right != null){
			right = traverse(root.right);
			// 将右边每一项前面增加 root.val，并增加到ans
			for(int i = 0, len = right.size(); i < len; i++) {
				ans.add("" + root.val + right.get(i));
			}
		}
		return ans;
	}

    public int sumNumbers(TreeNode root) {
        // 将所有路径相加
        ArrayList<String> list = traverse(root);
		int ans = 0;
		for(String item : list){
			ans += Integer.parseInt(item);
		}
		return ans;
    }
}