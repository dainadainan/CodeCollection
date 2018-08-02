package javaProgrammerConceptions.chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dainan
 * @Date: 2018/7/26 19:56
 * @Description:
 */
public class VampireNumber {
    static List<Integer> getVampireNumber() {
        List<Integer> number = new ArrayList<Integer>();
        for (int i = 10; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                int temp = i * j;
                int result = temp;
                if (temp < 999 || temp > 10000 || (temp % 100 == 0) || ((temp - i - j) % 9 != 0)) {
                    continue;
                }
                List<Integer> factorInteger = new ArrayList<Integer>();
                List<Integer> allInteger = new ArrayList<Integer>();
                /**拆分数字**/
                while (temp > 0) {
                    allInteger.add(temp % 10);
                    temp /= 10;
                }
                int left = i;
                int right = j;
                while (left > 0 || right > 0) {
                    factorInteger.add(left % 10);
                    left /= 10;
                    factorInteger.add(right % 10);
                    right /= 10;
                }
                if(!factorInteger.containsAll(allInteger)||!allInteger.containsAll(factorInteger)){
                    continue;
                }

                System.out.println(i + " " + " " + j + " " + result);
                number.add(result);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(getVampireNumber().toString());
    }
}
