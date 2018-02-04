package LeetCode;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Administrator on 2017/12/1.
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *      0
 *     / \
 *   -3   9
 *   /   /
 * -10  5
 *
 */
public class ConvertSortedArraytoBinarySearchTree {
    public static void main(String[] args){
        ConvertSortedArraytoBinarySearchTree con = new ConvertSortedArraytoBinarySearchTree();
        TreeNode root  = con.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        System.out.println(root.val);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        //递归传递的参数是切割数组
        if(nums.length==0) return null;
        TreeNode result = new TreeNode(nums[nums.length/2]);
        if (nums.length/2-1>=0) result.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
        if (nums.length/2+1<nums.length) result.right=sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
        return result;

        //更好的方法是传递nums和便捷范围
    }
}
