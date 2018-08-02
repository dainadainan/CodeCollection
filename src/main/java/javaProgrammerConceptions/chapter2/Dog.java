package javaProgrammerConceptions.chapter2;

/**
 * @Author: dainan
 * @Date: 2018/7/25 16:41
 * @Description:
 */
public class Dog {
    String name;
    String says;
    private void honer(){
        int i  = 0;
        for (int j = 0; j < 9; j++) {
            int p = 0;
            p++;
        }
        i++;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "spot";
        dog1.says = "2123413";
        Dog dog2 = new Dog();
        dog2.says = "waf";
        dog2.name = "scruffy";
        dog1.name = dog2.name;
        dog1.says = dog2.says;
        System.out.println(dog1.equals(dog2));
        float p = 0;
        int a = 0;
        System.out.println(p == a);
        int pq = 1<<3;
        System.out.println(pq);
    }
}
