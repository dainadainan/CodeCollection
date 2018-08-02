package LeetCode;

/**
 * @Author: dainan
 * @Date: 2018/7/18 17:26
 * @Description:
 */
public class Palindrome {
    public static String getPalindrome(String ss) {
        if (ss == null || ss.length() == 0 || ss.length() == 1) {
            return ss;
        }
        int[][] dp = new int[ss.length() +2][ss.length() +2];
        /**
         * dp[i][i]=1
         * dp[i][i+1]=1 if str[i]==str[i+1]
         * **/
        /** i < j
         * dp[i,j] = dp[i+1,j-1] str[i] = str[j]
         * dp[i,j] = 0;
         * **/
        /**初始化**/
        for (int i = 0; i < ss.length() - 1; i++) {
            dp[i][i] = 1;
            if (ss.charAt(i) == ss.charAt(i + 1)) {
                dp[i][i + 1] = 1;
            }
        }
        String result = "";
        int length = 0;
        for (int k = 2; k < ss.length() ; k++) {
            for (int i = 0; i < ss.length() - k; i++) {
                if (ss.charAt(i) == ss.charAt(i + k)) {
                    dp[i][i + k] = dp[i + 1][i + k - 1];
                } else {
                    dp[i][i + k] = 0;
                }
            }
        }
        for (int i = 0; i < ss.length(); i++) {
            for (int j = i; j < ss.length(); j++) {
                if (dp[i][j] == 1) {
                    int temp = j - i + 1;
                    if (temp > length) {
                        length = temp;
                        result = ss.substring(i, j + 1);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String ss = "abcba";

        System.out.println(getPalindrome(ss));
    }
}
