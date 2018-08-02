package javaProgrammerConceptions.chapter5;

/**
 * @Author: dainan
 * @Date: 2018/7/27 11:32
 * @Description:
 */
public class ThisTest {
    String p;
    String p2;
    void function1() {
        System.out.println("111");
    }

    void function2() {
        this.function1();
        System.out.println("2222222");
        function1();
    }

    public static void main(String[] args) {
        new ThisTest("ww").function2();
    }
    ThisTest(String ss){
        p = ss;
    }
    ThisTest(String p,String p2){
        this(p);
        this.p2 = p2;
    }



}
