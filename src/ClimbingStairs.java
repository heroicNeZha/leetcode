package LeetCode;

/**
 * Created by Administrator on 2017/11/21.
 * dynamic programming
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        //速度太慢
        /*        if(n<=2){
            return n;
        }else{
            return climbStairs(n-1)+climbStairs(n-2);
        }*/
        //循环
        if(n<3) return n;
        int preOne = 1;
        int preTwo = 2;
        boolean IsOne = true;
        for (int i = 3; i < n; i++) {
            if (IsOne) {
                preOne = preOne + preTwo;
                IsOne = !IsOne;
            } else {
                preTwo = preOne + preTwo;
                IsOne = !IsOne;
            }
        }
        return preOne+preTwo;
    }
}
