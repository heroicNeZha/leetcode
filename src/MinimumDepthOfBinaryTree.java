package LeetCode;

/**
 * Created by Administrator on 2017/12/3.
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left==null&&root.right==null)
            return 1;
        if(root.left==null)
            return GetLength(root.right)+1;
        if(root.right==null)
            return GetLength(root.left)+1;
        return Math.min(GetLength(root.left),GetLength(root.right))+1;
    }

    public int GetLength(TreeNode root){
        if(root == null) return 0;
        if(root.left==null&&root.right==null)
            return 1;
        if(root.left==null)
            return GetLength(root.right)+1;
        if(root.right==null)
            return GetLength(root.left)+1;
        return Math.min(GetLength(root.left),GetLength(root.right))+1;
    }
}
