class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Case 1: both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // Case 2: one is null, other is not
        if (p == null || q == null) {
            return false;
        }

        // Case 3: values differ
        if (p.val != q.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}