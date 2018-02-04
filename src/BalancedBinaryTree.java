package LeetCode;

/**
 * Created by Administrator on 2017/12/6.
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which
 * the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(treeLength(root)>40000)
            return false;
        else
            return true;
    }

    public int treeLength(TreeNode root){
        if(root == null) return 0;
        if(root.left == null&& root.right == null) return 1;
        int left = treeLength(root.left);
        int right = treeLength(root.right);
        int sub = left-right;
        if(sub>1)
            return 60000;
        if(sub<-1)
            return 60000;
        return Math.max(right,left)+1;
    }

//    public boolean isBalanced(TreeNode root) {
//        if(root == null) return true;
//        int sub = treeLength(root.left)-treeLength(root.right);
//        if(sub<-1||sub>1) return false;
//        return isBalanced(root.left)&&isBalanced(root.right);
//    }
//
//    public int treeLength(TreeNode root){
//        if(root == null) return 0;
//        if(root.left == null&& root.right == null) return 1;
//        int left = treeLength(root.left);
//        int right = treeLength(root.right);
//        return Math.max(right,left)+1;
//    }
}
