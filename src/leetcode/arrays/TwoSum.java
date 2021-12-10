package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = new int[]{2,5,5,11};
        int target = 10;

        twoSum(array, target);


//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    }


    public static int[] twoSum(int[] nums, int target) {
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

        for (int i : result) {
            System.out.print(i + " ");
        }

        return result;
    }
}
