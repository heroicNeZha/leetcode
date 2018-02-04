package LeetCode;

/**
 * Created by Administrator on 2017/11/14.
 * Given two binary strings, return their sum (also a binary string).
 *
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "100";
        String b = "110010";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        String result = "";
        boolean carry = false;
        int differLength = a.length() - b.length();
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 && j >= 0) {
            int temp = a.charAt(i)%48+b.charAt(j)%48+(carry?1:0);
            carry = temp>1;
            result = (temp%2) + result;
            i--;j--;
        }
        if(i>=0){
            if(carry){
                while(i>=0){
                    int temp = a.charAt(i)%48 +(carry?1:0);
                    carry = temp>1;
                    result = (temp%2) + result;
                    i--;
                }
            }else {
                result = a.substring(0,i+1)+result;
            }
        }else if(j>=0){
            if(carry){
                while(j>=0){
                    int temp = b.charAt(j)%48 +(carry?1:0);
                    carry = temp>1;
                    result = (temp%2) + result;
                    j--;
                }
            }else {
                result = b.substring(0,j+1)+result;
            }
        }
        if(carry){
            result = "1" + result;
        }
        return result;
    }
}
