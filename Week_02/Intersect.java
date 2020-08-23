package Week_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
求2个数组的交集
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> appearMap = new HashMap<>();
        for (int num : nums1) {
            int count = appearMap.getOrDefault(num, 0) + 1;
            appearMap.put(num, count);
        }

        int index = 0;
        int[] resultArr = new int[nums1.length];
        for (int num :
                nums2) {
            int count = appearMap.getOrDefault(num, 0);
            if (count > 0) {
                resultArr[index++] = num;
                appearMap.put(num, --count);
            } else {
                appearMap.remove(num);

            }


        }
        return Arrays.copyOfRange(resultArr, 0, index);
    }



}
