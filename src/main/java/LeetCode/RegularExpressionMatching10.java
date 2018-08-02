package LeetCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: dainan
 * @Date: 2018/7/23 19:29
 * @Description:
 */
public class RegularExpressionMatching10 {
    public static boolean isMatch(String s, String p) {
        if(s.equals("") && p.length()>0){
            return  false;
        }
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(p);
        // 现在创建 matcher 对象
        Matcher m = r.matcher(s);
        String result = "";
        if (m.find()) {
            result = m.group(0);
        }
        return  s.equals(result);
    }
    public static void main(String[] args){
        System.out.println(isMatch("","."));
    }
}
