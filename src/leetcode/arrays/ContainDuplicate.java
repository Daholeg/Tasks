package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        System.out.println(containsDuplicate(array));

//        Input: nums = [1,2,3,1]
//        Output: true
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }
}
