package javaProgrammerConceptions.chapter4;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dainan
 * @Date: 2018/7/26 19:28
 * @Description:
 */
public class Fibonacci {
    static List<Integer> getFibonacci(int input) {
        List<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(1);
        int num = 1;
        while (input > number.get(num)) {
            number.add(number.get(num) + number.get(num - 1));
            num++;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(getFibonacci(5).toString());
    }
}
