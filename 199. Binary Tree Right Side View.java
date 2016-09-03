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
    public void levelTree(TreeNode root, int level, ArrayList<ArrayList<Integer>> ans) {
        if(root == null) {
            return;
        }
        if(level == ans.size()) {
            ans.add(new ArrayList<Integer>());
        }
        ans.get(level).add(root.val);
        levelTree(root.left, level + 1, ans);
        levelTree(root.right, level + 1, ans);
    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        levelTree(root, 0, list);
        ArrayList<Integer> ans = new ArrayList<Integer>(); 
        for(int i = 0, len = list.size(); i < len; i++) {
            ans.add(list.get(i).get(list.get(i).size() - 1));
        }
        return ans;
    }
}