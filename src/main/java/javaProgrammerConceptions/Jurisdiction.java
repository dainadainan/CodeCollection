package javaProgrammerConceptions;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.io.IOException;
import java.util.Arrays;

/**
 * @Author: dainan
 * @Date: 2018/7/23 14:51
 * @Description:
 */
public class Jurisdiction {
    private Sword sword = new Sword();

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }
    /**其他类不能访问Sword**/
    private  class Sword{
        private int length;
        private int power;

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }
    }

    public static void main(String[] args) {
        String[] ar_str1, ar_str2;
        int sum = 0;
        int from;
        int to;
        int i_val;
        int count = 0;
        // 双重循环穷举
        for (int i = 10; i < 100; i++) {
            // j=i+1避免重复
            from = Math.max(1000 / i, i + 1);
            to = Math.min(10000 / i, 100);
            for (int j = from; j < to; j++) {
                i_val = i * j;
                // 下面的这个代码，我个人并不知道为什么，汗颜
                if (i_val % 100 == 0 || (i_val - i - j) % 9 != 0) {
                    continue;
                }
                count++;
                ar_str1 = String.valueOf(i_val).split("");
                ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                Arrays.sort(ar_str1);
                Arrays.sort(ar_str2);
                if (Arrays.equals(ar_str1, ar_str2)) {// 排序后比较,为真则找到一组
                    sum++;
                    System.out.println("第" + sum + "组: " + i + "*" + j + "=" + i_val);
                }
            }
        }
        System.out.println("共找到" + sum + "组吸血鬼数");
        System.out.println(count);
    }

}
