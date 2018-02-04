package LeetCode;

/**
 * Created by Administrator on 2017/11/11.
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 *
 */
public class LengthOfLastWord {
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("a "));
    }
    public static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len =0;
        for(int i= s.length()-1;i>=0;i--){
            if(' '!=chars[i])
                len++;
            else{
                if(len==0){
                    continue;
                }else
                    return len;
            }
        }
        return len;
        //return s.split(" ").length>0?s.split(" ")[(int)(s.split(" ").length-1)].length():0;
    }
}
