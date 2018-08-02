package javaProgrammerConceptions.chapter4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @Author: dainanhhhhhh
 * @Date: 2018/7/23 14:55
 * @Description:
 */
public class CtrlStop4_3 {
    static volatile int value = 0;
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                try {
                    value = System.in.read();
                    System.out.println(value+ "输入的值");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }.start();
        new Thread(){
            int pre = 0;
            int n = 20;
            @Override
            public void run(){
                while (n-- > 0) {
                    int number = new Random().nextInt(100);
                    if(number == pre){
                        System.out.println(number + "等于之前的值");
                    }
                    if(number > pre){
                        System.out.println(number + "大于之前的值");
                    }
                    if(number < pre){
                        System.out.println(number + "小于之前的值");
                    }
                    pre = number;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if(value != 0){
                        System.out.println(value);
                        break;
                    }

                }
            }
        }.start();


    }
}
