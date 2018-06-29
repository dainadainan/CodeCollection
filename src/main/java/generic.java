import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: dainan
 * @Date: 2018/6/28 20:08
 * @Description:泛形
 */
public class generic {

    /**JAVA泛型通配符的使用规则就是赫赫有名的“PECS”（生产者使用“? extends T”通配符，消费者使用“? super T”通配符）。*/
    public static void main(String[] args){
        List<?> names = new ArrayList();
        //  通配符声明的集合，获取的元素都是Object类型
        List<Object> allNames = new ArrayList();
        allNames.addAll(names);
        //  只能以Object迭代元素
        for(Object name: names) {
            System.out.println(name);
        }
        Integer p = 4518;
        int q = 4518;
        System.out.println((p)==(q));

    }

}
