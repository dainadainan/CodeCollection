package javaProgrammerConceptions.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dainan
 * @Date: 2018/7/27 10:33
 * @Description:
 */
public class StringTest1 {
    String string = null ;
    String string2;
    void print(List number){
        for(Object t:number){
            System.out.println(t);
        }
    }
   void StringTest1(int string,String string2){
        System.out.println();
    }
    private void StringTest1(String string2, int string){

    }
    public static void main(String[] args) {
        System.out.println(new StringTest1().string);
        System.out.println(new StringTest1().string2);
        List<Integer> number = new ArrayList<Integer>();
        number.add(11);
        new StringTest1().print(number);
        int  p = 8;
        Object pp = p;
    }
}
