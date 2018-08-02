package LeetCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: dainan
 * @Date: 2018/7/20 17:54
 * @Description:
 */
public class Atoi8 {
    public static int myAtoi(String str) {

        String pattern = "^\\s*(-|\\+)?[0-9]+";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(str);
        String result = "";
        if (m.find()) {
            result = m.group(0);
        }
        result = result.replace(" ", "");
        if (result.length() == 0) {
            return 0;
        }
        /**去除数字前面的0**/
        int i = 0;
        while (result.charAt(i) < '1' || result.charAt(i) > '9') {
            i++;
            if (i >= result.length()) {
                break;
            }
        }
        result = result.substring(0, i).replace("0", "") + result.substring(i, result.length());
        if (result.length() == 0 || result.equals("+") || result.equals("-")) {
            return 0;
        }
        //result大于int
        if (result.length() > 12 && result.charAt(0) != '-') {
            return Integer.MAX_VALUE;
        }
        if (result.length() > 12 && result.charAt(0) == '-') {
            return Integer.MIN_VALUE;
        }
        long longResult = Long.valueOf(result);
        if (longResult > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (longResult < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(result);
    }

    public static void main(String args[]) {
        System.out.println(myAtoi(" +0a32"));
    }
}
