package LeetCode;

/**
 * Created by Administrator on 2017/12/4.
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        //我的解法

        if(root==null) return false;
        sum-=root.val;
        if(root.left==null&&root.right==null)
            return sum==0;
        /*
        if(root.left==null)
            return hasPathSum(root.right,sum);
        if(root.right==null)
            return hasPathSum(root.left,sum);
        */
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);

        //第一解法

//        if (root == null) return false;

//        if (root.left == null && root.right == null && sum - root.val == 0) return true;

//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
