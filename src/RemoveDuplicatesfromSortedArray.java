package LeetCode;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/11/9.
 * 26. Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args){
        int[] nums = {3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;
        int index = 1;
        for(int i= 1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
}
