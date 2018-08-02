package javaProgrammerConceptions.chapter2;

/**
 * @Author: dainan
 * @Date: 2018/7/25 15:24
 * @Description:
 */
public class DataOnly {
    /**
     * i
     */
    int i ;
    /**
     * d
     */
    double d;
    /**
     *
     */
    boolean b;

    /**
     * test
     * @param s
     * @return
     */
    int storage(String s){
        return  s.length() *2;
    }
    public static void main(String[] args){
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 100;
        DataOnly pp = new DataOnly();
        pp.i = 100;
        System.out.println(dataOnly.equals(pp));
    }



}
