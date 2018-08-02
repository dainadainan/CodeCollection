package LeetCode;

import com.google.gson.Gson;
import redis.clients.jedis.Jedis;

import java.util.*;

/**
 * @Author: dainan
 * @Date: 2018/6/29 16:37
 * @Description:
 */
public class Solve {
   static Long get(long pp){
       return  pp;
   }
    public static void main(String[] args){
         List<String> ss = Arrays.asList("1","2","3","4","5");
         ss = new ArrayList<String>(ss);

        int size = ss.size();
         for(int i = size - 1; i>=0; i--){
             if(ss.get(i) == "3"){
                 ss.remove(i);
             }else{
                 System.out.println(ss.get(i));
             }
         }
        Iterator<String> it = ss.iterator();
        while(it.hasNext()){
            String x = it.next();
            if(x.equals("1")){
                it.remove();
            }
        }
    }
}
