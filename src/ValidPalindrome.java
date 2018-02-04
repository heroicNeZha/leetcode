package LeetCode;

/**
 * Created by Administrator on 2018/1/28.
 */
public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindromeOnRecurrence(s));
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

    //最快方法
    public static boolean isPalindromeOnBest(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            //System.out.println("Coming to while loop for i " + i + " J " + j);
            char lc = s.charAt(i);
            char rc = s.charAt(j);

            if((lc < 65 || lc > 90) && (lc < 97 || lc > 122) && (lc < 48 || lc > 57)) {
                //System.out.println("Came here for char A " + rc);
                i++;
                continue;
            }

            //System.out.println("OUTSIDE A Came here for char " + lc);
            if((rc < 65 || rc > 90) && (rc < 97 || rc > 122) && (rc < 48 || rc > 57)) {
                //System.out.println("Came here for char B" + rc);
                j--;
                continue;
            }
            //System.out.println("OUTSIDE Came here for char B" + rc);
            if (lc != rc) { // Mean either a is upper case or a is lower case
                //System.out.println("Coming here for lc " + lc  +  " rc " + rc);
                if (lc >= 65  && lc <= 90) {
                    return (lc -'A') == (rc -'a');
                    // if a is upper case then substract a from A which will give you [0-26]
                    // and substract rc from lower case which will also give you [0-26]
                }
                if (lc >= 97 && lc <= 122) {
                    return (lc - 'a') == (rc -'A');
                    // if lc is lower case then substract lc from a(109) which will give you [0-26]
                    // and substract rc from uppercase A(65) which will also give you [0-26]
                }
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
