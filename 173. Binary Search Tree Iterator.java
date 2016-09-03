/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    LinkedList<Integer> list;
    public BSTIterator(TreeNode root) {
        list = new LinkedList<Integer>();
        inorderTraversal(root);
    }

    private void inorderTraversal(TreeNode root) {
        if(root != null) {
            if(root.left != null) {
                inorderTraversal(root.left);
            }
            list.add(root.val);
            if(root.right != null) {
                inorderTraversal(root.right);
            }
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !list.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        return (int) list.poll();
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */