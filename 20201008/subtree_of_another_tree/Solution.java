package subtree_of_another_tree;

/**
 * ClassName Solution
 * Description TODO
 * Author 30712
 * Date 2020-10-08
 * Time 22:16
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    public boolean isSameTree (TreeNode p , TreeNode q){
        if(p == null && q == null) {
            return true;
        }
        if( p == null || q ==null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right ,q.right);
    }
    public boolean search(TreeNode root , TreeNode t) {
        if(root == null) {
            return false;
        }
        if(root.val == t.val) {
            if(isSameTree(root,t)) {
                return true;
            }
        }
        if(search(root.left,t)) {
            return true;
        }
        return search(root.right ,t);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return search(s,t);
    }
}
