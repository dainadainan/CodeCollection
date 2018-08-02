package LeetCode;

import java.util.HashMap;

/**
 * @Author: dainan
 * @Date: 2018/6/29 11:50
 * @Description:
 */
public class TwoNumberAdd {
    public static  int[] twoSum(int[] nums, int target) {
        /**第一个Integer 代表值，第二个Integer代表位置**/
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int number = target - nums[i];
            if(map.containsKey(number)){
                return new int[] {map.get(target - nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public  static  void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums,target);
        System.out.println(result[0] + " " + result[1]);
    }
}
