package LeetCode;

public class SameTree {
    public static void main(String[] args) {
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        //大神的思路
        if (p==null && q==null)
            return true;
        if (p==null || q==null)
            return false;
        if (p.val==q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else return false;

        //你的思路
//        if (p == null) {
//            if (q == null)
//                return true;
//            else
//                return false;
//        } else {
//            if (q == null)
//                return false;
//        }
//
//        //判断左子树是否相同
//        if (p.left != null) {
//            if (q.left != null) {
//                if (!isSameTree(p.left, q.left))
//                    return false;
//            } else {
//                return false;
//            }
//        } else {
//            if (q.left != null) {
//                return false;
//            }
//        }
//
//        //判断右子树是否相同
//        if (p.right != null) {
//            if (q.right != null) {
//                if (!isSameTree(p.right, q.right))
//                    return false;
//            } else {
//                return false;
//            }
//        } else {
//            if (q.right != null) {
//                return false;
//            }
//        }
//
//
//        if (p.val == q.val)
//            return true;
//        else
//            return false;
    }
}
