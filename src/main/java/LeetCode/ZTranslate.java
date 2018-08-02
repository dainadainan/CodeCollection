package LeetCode;

/**
 * @Author: dainan
 * @Date: 2018/7/18 20:18
 * @Description:
 */
public class ZTranslate {
    public static String convert(String s, int numRows) {
        if(s == null || numRows == 1 || s.length() <= numRows){
           return s;
        }
        /**字母间的差距为0 ，2， 4， 6，8，**/
        int gap = 2 * (numRows - 1);
        int preDiff = gap;
        int nextDiff = 0;
        int position = 0;
        String result = "";
        for (int i = 0; i < numRows; i++) {
            position = i;
            result += s.charAt(position);
            while (position < s.length()) {
                position += preDiff;
                if (preDiff != 0 && position< s.length()) {
                    result += s.charAt(position);
                }
                position += nextDiff;
                if (nextDiff != 0 && position < s.length()) {
                    result += s.charAt(position);
                }
            }
            preDiff -= 2;
            nextDiff +=2;
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {
        String pp = "AS";
        System.out.println(convert(pp,3));
    }
}
