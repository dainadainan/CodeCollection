package javaProgrammerConceptions.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: dainan
 * @Date: 2018/7/31 16:26
 * @Description:
 */
public class StaticExample14 {
    static StaticExample14 p1 = new StaticExample14(1);

    static {
        StaticExample14 p2 = new StaticExample14(2);
    }

    int i;

    StaticExample14(int i) {
        System.out.println(i);
    }

    static void print(String... p) {
        for (String temp : p) {
            System.out.println(temp);
        }
    }
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }

    public static void main(String[] args) {
        new StaticExample14(3);
        int[] a = {0, 1};
        System.out.println(a.length);
        Integer[] p = new Integer[]{};
        print("1","2","3");
        Map<String,String> pp =new HashMap<String,String>();
        System.out.println("www");
        int n = 1;
        while(n++ < 100 ){
            System.out.println(tableSizeFor(n));
        }

    }
}
