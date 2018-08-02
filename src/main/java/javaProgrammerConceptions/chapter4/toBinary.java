package javaProgrammerConceptions.chapter4;

/**
 * @Author: dainan
 * @Date: 2018/7/26 16:46
 * @Description:
 */
public class toBinary {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("1111111");
                case 2:
                    System.out.println("222222222222");
                case 3:
                    System.out.println("3333333333");
                case 4:
                    System.out.println("54444444422");
                default:
                    System.out.println("gameover");
            }
        }

    }
}
