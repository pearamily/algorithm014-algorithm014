package Week_01;

import java.util.HashMap;

public class TwoSum {
    /*
    暴力解法
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    return  new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("");

    }


    /*
    使用map 去重？
     */
    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> map =  new HashMap<Integer,Integer>();
        for (int i = 0 ; i < nums.length ; i++) {
            int ele = target - nums[i];
            if ( map.containsKey(ele) ) {
                return new int[]{ i,map.get(ele) };
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("");

    }
}
