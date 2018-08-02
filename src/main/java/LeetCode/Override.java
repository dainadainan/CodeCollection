package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: dainan
 * @Date: 2018/7/6 15:10
 * @Description:
 */
public class Override {
    private static class wine{
        String name(){
            return "wine";
        }
    }
    private static class qingdaoWine extends wine{
        @java.lang.Override
        String name(){
            return "qingdao";
        }
    }
    private static class highQingdaoWine extends  qingdaoWine{
        @java.lang.Override
        String name(){
            return "highQingdaoWine";
        }
    }
    public static void main(String[] args){
        wine[] wines = {
                new wine(),new qingdaoWine(),new highQingdaoWine()
        };
        for(wine wine: wines){
            System.out.println(wine.name());
        }
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = -3 ; i < 3; i++){
            set.add(i);
            list.add(i);
        }
        for(int i = 0; i < 3; i++){
            set.remove(i);
            list.remove(i);
        }
        System.out.println(set+" "+list);

    }
}
