package LeetCode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/8/7.
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> longestSubString = new LinkedList<>();
        int length= 0;
        for(char ch :s.toCharArray()){
            if(longestSubString.contains(ch))
            {
                while(!longestSubString.poll().equals(ch));
            }
            longestSubString.offer(ch);
            if(longestSubString.size()>length)
            {
                length = longestSubString.size();
            }
        }
        return length;
    }
}
