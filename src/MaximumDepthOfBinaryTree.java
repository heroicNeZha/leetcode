package LeetCode;

/**
 * Created by Administrator on 2017/11/27.
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left = maxDepth(root.left)+1;
        int right = maxDepth(root.right)+1;
        return left>right?left:right;
    }
}
