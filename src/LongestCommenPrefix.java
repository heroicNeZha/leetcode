package LeetCode;
/**
 * Created by Administrator on 2017/11/5.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommenPrefix {
    public static void main(String[] args) {
        String[] strs = {"111"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs != null&&strs.length>0) {
            String longestPrefix = strs[0];
            for (String s : strs) {
                while (!s.startsWith(longestPrefix)) {
                    longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
                }
            }
            return longestPrefix;
        }
        return "";
    }
}
