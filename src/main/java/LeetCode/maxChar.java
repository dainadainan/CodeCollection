package LeetCode;

/**
 * @Author: dainan
 * @Date: 2018/7/18 09:53
 * @Description:
 */
public class maxChar {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        /**记录以字母结尾的最大字符长度**/
        int[] maxUnRepeatLength = new int[s.length()];
        int max = 1;
        maxUnRepeatLength[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            int length = 1;
            for (int j = i - 1; j >= i - maxUnRepeatLength[i - 1]; j--) {
                if (s.charAt(j) == s.charAt(i)) {
                    break;
                }
                length++;
            }
            max = max > length ? max : length;
            maxUnRepeatLength[i] = length;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "bb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
