package javaProgrammerConceptions.chapter5;

/**
 * @Author: dainan
 * @Date: 2018/7/27 14:12
 * @Description:
 */
public class FinalizeTest {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("I am terminator!!!!!!");
    }

    public static void main(String[] args) {
        FinalizeTest finalizeTest = new FinalizeTest();
        finalizeTest = null;
        System.gc();
    }
}
