package LeetCode;

/**
 * Created by Administrator on 2018/1/28.
 */
public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    //短字符串可以递归实现,过长不行
    private static boolean isPalindromeOnRecurrence(String s) {
        if(s.length()<=1) return true;
        if(Character.isLetterOrDigit(s.charAt(0))){
            if (Character.isLetterOrDigit(s.charAt(s.length()-1))){
                if (Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length()-1))){
                    return isPalindromeOnRecurrence(s.substring(1,s.length()-1));
                }
            }else{
                return isPalindromeOnRecurrence(s.substring(0,s.length()-1));
            }
        }else{
            return isPalindromeOnRecurrence(s.substring(1,s.length()));
        }
        return false;
    }

    //将Char的方法优化来提高效率
    private static boolean isPalindrome(String s) {
        if(s.equals("")) return true;
        for(int i = 0,j=s.length()-1;i<j;){
            if(Character.isLetterOrDigit(s.charAt(i))) {
                if (Character.isLetterOrDigit(s.charAt(j))) {
                    if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                        return false;
                    i++;
                    j--;
                } else {
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return true;
    }
}
