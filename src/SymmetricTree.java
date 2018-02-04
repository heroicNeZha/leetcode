package LeetCode;

/**
 * Created by Administrator on 2017/11/25.
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *    1
 *   / \
 *  2   2
 *  \   \
 *  3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */

public class SymmetricTree {


    public boolean isSymmetric(TreeNode root) {
        //递归算法
        if(root==null) return true;
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
            return p.val == q.val&&isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
}
