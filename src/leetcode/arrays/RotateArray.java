package leetcode.arrays;

public class RotateArray {
    public static void main(String[] args) {
//        Given an array, rotate the array to the right by k steps, where k is non-negative.

//        Example:
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]


        int[] array = new int[]{1,2,3,4,5,6,7,5,7};
        int step = 4;
    }


    public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];

        System.arraycopy(nums, nums.length - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, nums.length - k);
        System.arraycopy(result, 0, nums, 0, result.length);
    }
}
