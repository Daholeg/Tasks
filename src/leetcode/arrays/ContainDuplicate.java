package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
//        Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

//        Example:
//        Input: nums = [1,2,3,1]
//        Output: true

        int[] array = new int[]{1,2,3};
        System.out.println(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return set.size() != nums.length;
    }
}
