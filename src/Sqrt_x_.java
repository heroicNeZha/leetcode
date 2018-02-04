package LeetCode;

/**
 * Created by Administrator on 2017/11/18.
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * x is guaranteed to be a non-negative integer.
 *
 * Example 1:
 * Input: 4
 * Output: 2
 *
 * Example 2:
 * Input: 8
 * Output: 2
 *
 * Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be trunc
 */
public class Sqrt_x_ {
    public static void main(String[] args){
        System.out.print(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        long mid = x/2;
        long front = 0;
        long last = x;
        boolean flag = true;
        while(true){
            if(mid*mid > x){
                if((mid-1)*(mid-1)<=x)
                    return (int)(mid-1);
                last = mid-1;
                mid = (front+last)/2;
            }else if(mid*mid <= x){
                if((mid+1)*(mid+1)>x)
                    return (int)mid;
                front = mid+1;
                mid = (front+last)/2;
            }
        }

        //return (int)Math.sqrt(x);
    }
}
