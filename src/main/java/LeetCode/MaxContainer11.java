package LeetCode;

/**
 * @Author: dainan
 * @Date: 2018/7/23 19:43
 * @Description:
 */
public class MaxContainer11 {
    public int maxArea(int[] height) {
        if(height.length < 2 ){
            return  0;
        }
        int max  = 0;
        for(int i = 0; i < height.length;i++){
            for(int j = height.length - 1; j > i;j--){
                int deep = height[j] > height[i]? height[i]:height[j];
                max = max > deep*(j - i)?max:deep*(j - i);
            }
        }
        return  max;
    }
}
