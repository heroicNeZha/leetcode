package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/11/29.
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 * return its bottom-up level order traversal as:
 * [
 *  [15,7],
 *  [9,20],
 *  [3]
 * ]
 */
public class BinaryTreeLevelOrderTraversalII {

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        BinaryTreeLevelOrderTraversalII b = new BinaryTreeLevelOrderTraversalII();
        List<List<Integer>> result =  b.levelOrderBottom(root);
        System.out.println(result);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(root,0,result);
        Collections.reverse(result);
        return result;
    }

    void levelOrder(TreeNode root,int level,List<List<Integer>> result){
        if(root==null) return;
        if(level>=result.size()) {
            result.add(new ArrayList<>());
            result.set(level, new ArrayList<>());
        }
        result.get(level).add(root.val);
        levelOrder(root.left,level+1,result);
        levelOrder(root.right,level+1,result);
    }
}
