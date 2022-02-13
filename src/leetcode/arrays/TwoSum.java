package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
//        Given an array of integers Nums and an integer Target, return indices of the two numbers that gives a sum equals Target

//        Example:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].


        int[] array = new int[]{2,5,5,11};
        int target = 1;

        getTwoIndices(array, target);
    }


    public static int[] getTwoIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(temp == nums[j]){
                    list.add(i);
                    list.add(j);
                }
            }
            if(list.size() == 2){
                break;
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        System.out.println(Arrays.toString(result));

        return result;
    }
}
