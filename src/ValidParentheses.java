package LeetCode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/6.
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
    public static void main(String[] args){
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character,Character> paraMap = new HashMap<>();
        paraMap.put('[',']');
        paraMap.put('(',')');
        paraMap.put('{','}');
        paraMap.put(']','e');
        paraMap.put(')','e');
        paraMap.put('}','e');
        for (Character c: s.toCharArray()) {
            if((!stack.isEmpty())&&paraMap.get(stack.peek()).equals(c)){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
