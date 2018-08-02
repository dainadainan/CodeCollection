package javaProgrammerConceptions.chapter6.exe3;

import  javaProgrammerConceptions.chapter6.exe3.debugoff.doexe;

//import  javaProgrammerConceptions.chapter6.exe3.debug.doexe;
/**
 * @Author: dainan
 * @Date: 2018/8/1 11:52
 * @Description:
 */
public class main {
    intern pp = new intern();
    int j = 0;
    @Override
    public String toString(){
        return  j  + " ww" + pp;
    }
    private static class  intern{
        private int i ;
    }
    public static void main(String[] args) {
        System.out.println(new main().toString());
        System.out.println(new intern().toString());
        System.out.println(new main());
        int n =2;
        n |= n >>> 1;
        System.out.println(n);

    }
}
