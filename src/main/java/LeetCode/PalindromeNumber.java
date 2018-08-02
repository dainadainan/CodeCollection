package LeetCode;

/**
 * @Author: dainan
 * @Date: 2018/7/23 17:29
 * @Description:
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String pp = String.valueOf(x);
        StringBuilder number = new StringBuilder(pp);
        StringBuilder reverseNumber = new StringBuilder(pp);
        if(number.length() == 0){
            return true;
        }
        number.reverse();
        return  reverseNumber.toString().equals(number.toString());
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }
}
