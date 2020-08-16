package Week_01;

public class MoveZeroes {

    /*暴力解法*/
    public int[] moveZeroes (int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
        return nums;

    }


}
