/**
 * Created by Administrator on 2018/2/6.
 */
public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {2,2,1,3,5,1,3};
        System.out.println(singleNumber2(nums));
    }
    //最初
    public static int singleNumber(int[] nums) {
        int i;
        boolean flag = true;
        for (i=0;i<nums.length&&flag;i++) {
            for (int j = 0;j<nums.length;j++){
                if(nums[i]==nums[j]&&i!=j){
                    flag = true;
                    break;
                }
                flag = false;
            }
        }
        return nums[i-1];
    }

    //大牛用的异或
    public static int singleNumber2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
