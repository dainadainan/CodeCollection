package LeetCode;

/**
 * @Author: dainan
 * @Date: 2018/7/20 15:43
 * @Description:
 */
public class exchangeInteger7 {
    public static int reverse(int x) {
        int result = 0;

        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && x%10 > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && x%10 < -8)) return 0;
        }
        return result;
    }
    public static void main(String[] args ){
        int num = 1534236469;
        System.out.println(reverse(num));
    }
}
