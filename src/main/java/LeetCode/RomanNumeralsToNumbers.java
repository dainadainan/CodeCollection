package LeetCode;

/**
 * @Author: dainan
 * @Date: 2018/7/23 20:07
 * @Description:
 */
public class RomanNumeralsToNumbers {
    /**
     * 1 5 10
     */
    public String intToRoman(int num) {
        String[] romman = {"I", "V", "X", "L", "C", "D", "M"};
        return "";

    }

    String getNumber(String one, String five, String ten, int p) {
        String result = "";
        if (p == 1) {
            return ten;
        }
        if (p > 0 && p < 4) {
            for (int i = 0; i < p; i++) {
                result += one;
            }
            return result;
        }
        if (p == 4) {
            return one + five;
        }
        if (p == 5) {
            return five;
        }
        if (p > 5 && p < 9) {
            for (int i = 5; i < p; i++) {
                result += one;
            }
            return five + one;
        }
return "";
    }
}
