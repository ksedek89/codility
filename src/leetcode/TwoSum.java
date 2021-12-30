package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,4,2};
        int target = 6;
        int[] ints = new TwoSum().twoSum(nums, target);
        for(int i = 0; i< ints.length ;i++ ){
            System.out.print(ints[i] + ",");
        }

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tempMap = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            Integer difference2 = tempMap.get(difference);

            if(difference2 != null && difference2 != i){
                return new int[]{difference2, i};
            }
            tempMap.put( nums[i], i);
        }
        return new int[0];
    }
}
