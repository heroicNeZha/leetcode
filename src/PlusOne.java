package LeetCode;

/**
 * Created by Administrator on 2017/11/12.
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 *
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 *
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    public static void main(String[] args){
        int[] ints ={1,3,9};
        ints = plusOne(ints);
        for (int i :ints){
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        if(++digits[digits.length-1]>9) {
            for (int i = digits.length - 1; i > 0; i--) {
                if (digits[i] > 9) {
                    digits[i - 1]++;
                    digits[i] = 0;
                }
                else{
                    return digits;
                }
            }
            if (digits[0] > 9) {
                digits[0]=0;
                int[] newDigits = new int[digits.length + 1];
                for (int i = 0; i < digits.length; i++) {
                    newDigits[i + 1] = digits[i];
                }
                newDigits[0] = 1;
                return newDigits;
            }
        }
        return digits;
    }

}
