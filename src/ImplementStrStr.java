package LeetCode;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/11/10.
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Example 2:
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 */
public class ImplementStrStr {
    public static void main(String[] args){
        System.out.println(strStr("mississippi","issi"));
    }

    public static int strStr(String haystack, String needle) {
        char[] hayArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        if(haystack.equals(needle)||needleArray.length<1) return 0;
        if(hayArray.length<1||needleArray.length>hayArray.length||!haystack.contains(needle)) return -1;
        for (int i=0;i<hayArray.length;i++) {
            if(hayArray[i]==needleArray[0]){
                boolean result = true;
                for(int j=0;j<needleArray.length;j++){
                    if(i+j>=hayArray.length){ return -1;}
                    if(hayArray[i+j]!=needleArray[j]){
                        result = false;
                        break;
                    }
                }
                if(result) return i;
            }
        }
        return -1;
    }
}
